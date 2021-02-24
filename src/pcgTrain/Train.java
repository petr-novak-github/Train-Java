package pcgTrain;

import java.util.ArrayList;
import java.util.List;

public class Train
{
    Locomotive locomotive;
    List<IWagon> wagons;
	

    public List<IWagon> GetWagons()
    {
        return wagons;
    }

    void SetWagons(List<IWagon> value)
    {
        wagons = value;
    }

    Locomotive GetLocomotive()
    {
        return locomotive;
    }

    void SetLocomotive(Locomotive value)
    {
        locomotive = value;
    }
    public Train()
    {
        this.wagons = new ArrayList<IWagon>();    
    }

    public Train(Locomotive locomotive)
    {
        this.locomotive = locomotive;
        this.wagons = new ArrayList<IWagon>();
    }

    public Train(Locomotive locomotive, List<IWagon> wagons) 
    {
    	this(locomotive);
        this.wagons = wagons;
    }

    public void ConnectWagon(IWagon wagon) {
        if (this.wagons.size()<5)
        {
            this.wagons.add(wagon);
        }

        else
        {
            System.out.println("Nelze pripojit dalsi vagon, vlak muze mit max 5 wagonu.");
        }
    }
    public void DisconnectWagon(IWagon wagon)
    {
        if (wagons.contains(wagon))
        {
            wagons.remove(wagon);

        } }

    public void ReserveChair(int cisloWagonu, int cisloSedadla) {

        int pocetWagacu = wagons.size();
        Object[] poleWagacu = new IWagon[pocetWagacu];
        poleWagacu =  wagons.toArray();
        IWagon thisWagonek = (IWagon) poleWagacu[cisloWagonu];

        if (thisWagonek instanceof PersonalWagon)
        {
        PersonalWagon thisWagonekPW = (PersonalWagon)thisWagonek;
        int pocetKreselVeWagaci = thisWagonekPW.GetSits().size();


        if (poleWagacu[cisloWagonu] instanceof PersonalWagon & cisloWagonu<=pocetWagacu)
        {
            Object[] poleKreselVeWagaci = new Chair[pocetKreselVeWagaci];
            poleKreselVeWagaci = ((PersonalWagon)(thisWagonek)).GetSits().toArray();
            Chair thisZidle = (Chair)poleKreselVeWagaci[cisloSedadla];
            if (thisZidle.GetReserved() == true)
            {
                System.out.println("Sedadlo uz je reserved.");
            }


            if (((PersonalWagon)thisWagonek).GetNumberOfChairs() > cisloSedadla)
            {
                
            	thisZidle.SetReserved(true); 
            	System.out.println("Sedadlo "+ cisloSedadla + " rezervovano ve vagonu " + cisloWagonu);
            }
        }
        }
        else
        {
            System.out.println("Nelze reservovat ve vagonu typu " + poleWagacu[cisloWagonu].getClass().getName().substring(9) );
        }
        

    }
    public void ListReservedChairs() {

        int pocetWagacu = wagons.size();
        Object[] poleWagacu = new IWagon[pocetWagacu];
        poleWagacu = wagons.toArray();
        String ret2 = "Reserved seats: \n";
        
   
        for (int i = 0; i < pocetWagacu; i++)
        {
        	IWagon thisWagonek = (IWagon) poleWagacu[i];   
        if (thisWagonek instanceof PersonalWagon)
        {
                PersonalWagon thisPersonalniWagac = (PersonalWagon)thisWagonek;
                int pocetKresell = thisPersonalniWagac.GetSits().size();

                Object[] poleKreselVeWagaci = new Chair[pocetKresell];
               
                poleKreselVeWagaci = thisPersonalniWagac.GetSits().toArray();
               
                for (int j = 0; j < poleKreselVeWagaci.length; j++)
                {
                	Chair thisZidla = (Chair)poleKreselVeWagaci[j];
                    if (thisZidla.GetReserved() == true)
                    {
                       
                        ret2 += i + ". wagon - " + j + ". sedadlo \n";
                    }
                }

            }
            
        }


        System.out.println("V tomto vlaku jsou rezervovana tyto sedadla (cisloWagonu - cisloSedadla) \n"+  ret2);
    }

    public  String toString()

    {
        String ret="";
        for (IWagon item : wagons)
       
        {
            ret += item.toString() + "\n";
        }
        return "Vlak s lokomotivou"+ locomotive.toString()+ " a s vagonama: \n"+ret ;
    }
}
