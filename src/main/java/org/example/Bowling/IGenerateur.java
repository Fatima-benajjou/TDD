package org.example.Bowling;


public interface IGenerateur {
    public int randomPin(int max);
}



//on lui donne la valeur qu'il peut faire tomber des quille au maximum
//dans un roll1, le max est 10, dans un roll 2 le max sera 10 - le nb de quille tombé au roll1
