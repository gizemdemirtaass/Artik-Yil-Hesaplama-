package com.company;

public class Main {

    public static void main(String[] args) {
	int yil = 2020;
    boolean artik = false;
    if ( yil % 4 == 0)
    {
        if(yil % 100 == 0)
        {
            if (yil % 400 == 0)
                artik = true;
            else
                artik = false;
        }else
            artik = true;
    }else
            artik = false;
    if(artik){
        System.out.println(yil+ "  artık yıldır \n");
    }else{
        System.out.println(yil+ " artık yıl değildir\n");
    }

    }
    }



