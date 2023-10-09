package calculator;

public class Calculator {
    private Cpu cpu;

    private Gpu gpu;

    public Calculator(Cpu cpu, Gpu gpu) {
        if (validateCpuAndGpu(cpu, gpu)) {
            this.cpu = cpu;
            this.gpu = gpu;
        } else {
            System.out.println("Componentele calculatorului nu sunt compatibile");
        }
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setGpu(Gpu gpu) {
        if (validateCpuAndGpu(this.cpu, gpu)) {
            this.gpu = gpu;
        } else {
            System.out.println("Componentele calculatorului nu sunt compatibile");
        }
    }

    private boolean validateCpuAndGpu(Cpu cpu, Gpu gpu) {
        return cpu.getBrand() == gpu.getBrand();
    }

    public Gpu getGpu() {
        return gpu;
    }

}
