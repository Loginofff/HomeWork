public class Main {
    public static void main(String[] args) {

//Есть телевизор (TV)
//В телевизоре можно хранить набор каналов (Channel). +
//В каждом канале может быть набор передач (Program).
//Есть пульт от телевизора (RemoteController).
//Реализовать в пульте метод:
//public void on(int channelNumber) - данный метод
//позволит показать (напечатать в консоль) случайную передачу
//канала с номером channelNumber
//В main продемонстрировать работу программу


        //Был водитель, он связан с автобусом, а автобус с ним
        //Был автобус, у него были пассажиры.
        //Есть телевизор, он связан с пультом.
        //Есть телевизор, и в нем массив каналов.
        //Есть канал, а в канале массив программ.
        //remoteController.on(2)
        //  -> Tv
        //    -> Channel
        //      -> Program -> печатает свое название





        Channel channel1 = new Channel(1, new Program[]{
                new Program("Рыбалка"),
                new Program("Балет"),
                new Program("И снова балет")
        });

        Channel channel2 = new Channel(2, new Program[]{
                new Program("Жизнь и балет"),
                new Program("Пока все дома")
        });

        TV tv = new TV(new Channel[]{channel1, channel2});

        RemoteController remoteController = new RemoteController(tv);
        remoteController.on(1);
        remoteController.on(2);
        remoteController.on(3);
    }
        }



