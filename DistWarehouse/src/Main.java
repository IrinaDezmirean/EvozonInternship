import Repo.Warehouse;

public class Main
{
    public static void main(String[] args)
    {

        Warehouse wh = new Warehouse("warehouse.txt");
        wh.generatePackages();
    }
}