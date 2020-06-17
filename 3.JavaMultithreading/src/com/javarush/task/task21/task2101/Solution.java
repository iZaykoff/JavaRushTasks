package com.javarush.task.task21.task2101;

/*
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] adress = new byte[4];

        for (int i = 0; i < 4; i++) {
            adress[i] = (byte) (ip[i] & mask[i]); // то как НАДО!
        }
            //Как написал я
//        for (int i = 0; i < 4; i++) {
//            char[] arrIp = String.format("%8s", Integer.toBinaryString(ip[i] & 0xFF)).replace(' ', '0').toCharArray();
//            char[] arrMask = String.format("%8s", Integer.toBinaryString(mask[i] & 0xFF)).replace(' ', '0').toCharArray();
//            StringBuffer buffer = new StringBuffer();
//
//            for (int j = 0; j < 8; j++) {
//                if (arrIp[j] == arrMask[j]) {
//                    buffer.append(Character.digit(arrIp[j], 10));
//                } else {
//                    buffer.append(0);
//                }
//            }
//            adress[i] = (byte) Integer.parseInt(String.valueOf(buffer), 2);
//        }
        return adress;
    }

    public static void print(byte[] bytes) {
        for (byte aByte : bytes) {
            System.out.print(String.format("%8s", Integer.toBinaryString(aByte & 0xFF)).replace(' ', '0') + " ");
        }
        System.out.println();
    }
}
