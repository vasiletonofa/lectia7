import calculator.Brand;
import calculator.Calculator;
import calculator.Cpu;
import calculator.Gpu;

public class Main {
    public static void main(String[] args) {

       Cpu cpu = new Cpu(Brand.ASUS, "Asus Procesor");

       Gpu gpu = new Gpu(Brand.ASUS, "Asus placa video");

       Calculator calculator = new Calculator(cpu, gpu);

        System.out.println(calculator.getGpu().getBrand());
        System.out.println(calculator.getGpu().getDenumire());

        Gpu gpu1 = new Gpu(Brand.LENOVO, "Lenovo placa video V2");

        calculator.setGpu(gpu1);

        System.out.println("Upgrade: " + calculator.getGpu().getBrand());
        System.out.println("Upgrade: " + calculator.getGpu().getDenumire());
    }
}