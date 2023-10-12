package Ext_14_15;

import Ext_14_15.Controller.AnimalController;
import Ext_14_15.Model.HomeAnimals;
import Ext_14_15.Servise.HomeAnimalsRepository;
import Ext_14_15.Servise.IRepository;
import Ext_14_15.UserInterface.ConsoleMenu;

public class Program {
    public static void main(String[] args) throws Exception {

        IRepository <HomeAnimals> myFarm = new HomeAnimalsRepository();
        AnimalController controller = new AnimalController(myFarm);
        new ConsoleMenu (controller).start();
    }
}    