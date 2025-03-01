package org.mypractice.multithreading;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class CompleteCalculation {

        public BigInteger calculateResult(BigInteger base1, BigInteger power1, BigInteger base2, BigInteger power2){
            BigInteger result;
            List<Thread> threadList = new ArrayList<>();
            PowerCalculatingThread trd1 = new PowerCalculatingThread(base1,power1);
            PowerCalculatingThread trd2 = new PowerCalculatingThread(base2,power2);
            threadList.add(trd1);
            threadList.add(trd2);
            for(Thread thread: threadList){
                thread.start();
                thread.run();
            }
            try {
                threadList.get(0).join();
                threadList.get(1).join();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            result = trd1.getResult().add(trd2.getResult());
        /*
            Calculate result = ( base1 ^ power1 ) + (base2 ^ power2).
            Where each calculation in (..) is calculated on a different thread
        */

            return result;
        }

    private static class PowerCalculatingThread extends Thread {
        private BigInteger result = BigInteger.ONE;
        private BigInteger base;
        private BigInteger power;

        public PowerCalculatingThread(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
           /*
           Implement the calculation of result = base ^ power
           */
           this.result = calculate(base,power);
        }

        private BigInteger calculate( BigInteger base, BigInteger power){
            if( power.intValue() != 1){
                calculate(base, power.subtract(BigInteger.valueOf(1l)) );
            }
            BigInteger resultT = power.multiply(base) ;
            return resultT;
        }
        public BigInteger getResult() { return result; }
    }

}
