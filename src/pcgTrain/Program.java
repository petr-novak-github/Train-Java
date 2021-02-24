package pcgTrain;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var w1 = new BusinessWagon(100, new Person("Lenka","Kozakova"));
        var w2 = new NightWagon(50,50);
        var w3 = new Hoper(1000);
        var lok1 = new Locomotive(new Person("Karel","Novak"), new Engine("diesel"));
        //c sharp code
        //var train1 = new Train(lok1,new ArrayList<IWagon>() {w1,w2,w3 } );
        //nahradim timhle bo sem lama
        List<IWagon> train1list = new ArrayList<IWagon>();
        train1list.add(w1);
        train1list.add(w2);
        train1list.add(w3);
        var train1 = new Train(lok1,train1list);
        //nahradim timhle bo sem lama
        var w4 = new Hoper(500);
        train1.ConnectWagon(w4);
        var lok2 = new Locomotive(new Person("Josef", "Kaplan"), new Engine("parni"));
        var wx1 = new EconomyWagon(80);
        var wx2 = new EconomyWagon(80);
        var wx3 = new EconomyWagon(80);
        var wx4 = new EconomyWagon(80);
        var wx5 = new EconomyWagon(80);
       // var train2 = new Train(lok2, new List<IWagon>() {wx1, wx2, wx3, wx4, wx5 });
        //same fucking story

        List<IWagon> train2list = new ArrayList<IWagon>();
        train1list.add(wx1);
        train1list.add(wx2);
        train1list.add(wx3);
        train1list.add(wx4);
        train1list.add(wx5);
        
        var train2 = new Train(lok2,train2list);
        
        train2.ConnectWagon(new EconomyWagon(50));
       // train2.ReserveChair(3,3);
        //pokus o rezervovani v hoppru
        //train1.ReserveChair(3,5);
        //pokus o rezervovani jiz rezervovaneho sedadla
        //train2.ReserveChair(3, 3);
       // train2.ReserveChair(1, 79);
      //  train1.ListReservedChairs();
        //train2.ListReservedChairs();

        System.out.println(  train1.toString() );
        System.out.println(  train2.toString() );
	}

}
