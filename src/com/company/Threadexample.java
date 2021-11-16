package com.company;

import java.util.LinkedList;

    public class Threadexample {

        public static void main(String[] args) throws InterruptedException
        {
            final PC pc = new PC();

            Thread t1 = new Thread(new Runnable() // Создать ветку производителя
            {
                @Override
                public void run()
                {
                    try
                    {
                        pc.produce();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                }

            });


            Thread t2 = new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    try
                    {
                        pc.consume();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }

            });


            // Запускаем оба потока

            t1.start();

            t2.start();


            // t1 заканчивается до t2

            t1.join();

            t2.join();

        }



        public static class PC
        {
            LinkedList<Integer> list = new LinkedList<>(); // общий ресурс
            int capacity = 2;


            public void produce() throws InterruptedException // Функция вызывается потоком производителя
            {
                int value = 0;
                while (true)
                {
                    synchronized (this)
                    {
                        while (list.size() == capacity) // поток производителя ждет пока список полон
                            wait();

                        System.out.println("Producer produced-"

                                + value);


                        // для вставки работ в список

                        list.add(value++);


                        // уведомляет потребительский поток, что

                        // теперь он может начать потреблять

                        notify();


                        // облегчает работу программы

                        // понять

                        Thread.sleep(1000);

                    }

                }

            }

            public void consume() throws InterruptedException // Функция вызывается потребительским потоком
            {
                while (true)
                {
                    synchronized (this)
                    {
                        while (list.size() == 0) // потребитель ожидает пока список пуст
                            wait();

                        int val = list.removeFirst(); // чтобы получить первое задание в списке

                        System.out.println("Consumer consumed-"+ val);

                        notify(); // ветку продюсера будим

                        Thread.sleep(1000);

                    }

                }

            }

        }
    }
