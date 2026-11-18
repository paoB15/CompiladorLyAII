
package com.mycompany.repaso_automatas2;

import java.util.ArrayList;
import java.util.List;

public class IntermediateCodeGenerator {
    private int tempCount = 0;
    private int labelCount = 0;
    private List<String> instructions;

    public IntermediateCodeGenerator() {
        this.instructions = new ArrayList<>();
    }

    public String newTemp() {
        tempCount++;
        return "t" + tempCount;
    }

    public String newLabel() {
        labelCount++;
        return "L" + labelCount;
    }

    public void emit(String instruction) {
        instructions.add(instruction);
    }

    public void printCode() {
        System.out.println("=== CÓDIGO INTERMEDIO (TAC) ===");
        for (int i = 0; i < instructions.size(); i++) {
            System.out.println((i + 1) + ": " + instructions.get(i));
        }
        System.out.println("================================\n");
    }

    public List<String> getInstructions() {
        return instructions;
    }
}
