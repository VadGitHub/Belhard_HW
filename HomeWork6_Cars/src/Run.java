import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Run {
    public static void main(String[] args) {
        Driver driver1 = new Driver();
        driver1.setsName("Иванов");
        driver1.setfName("Петр");
        driver1.setmName("Алексеевич");
        driver1.setDriveExp(35);

        Driver driver2 = new Driver();
        driver2.setsName("Шумахер");
        driver2.setfName("Михаил");
        driver2.setmName("Батькович");
        driver2.setDriveExp(27);

        Engine motor1 = new Engine();
        motor1.setManufacture("USA");
        motor1.setPower(700);

        Engine motor2 = new Engine();
        motor2.setManufacture("Italy");
        motor2.setPower(550);

        Lorry truck1 = new Lorry();
        truck1.setAutoBrand("MC Truck");
        truck1.setMaxCargo(15700);
        truck1.setAutoWeight(5450);
        truck1.setAutoClass('T');
        truck1.setMotor(motor1);
        truck1.setDriver(driver1);

        SportCar sportcar1 = new SportCar();
        sportcar1.setAutoBrand("Ferrari");
        sportcar1.setMaxSpeed(320);
        sportcar1.setAutoWeight(3100);
        sportcar1.setAutoClass('S');
        sportcar1.setMotor(motor2);
        sportcar1.setDriver(driver2);

        //Полная информация о грузовике и его водителе
        System.out.println(truck1.toString());
        //Полная информация о спорткаре и его водителе
        System.out.println(sportcar1.toString());





    }
}
