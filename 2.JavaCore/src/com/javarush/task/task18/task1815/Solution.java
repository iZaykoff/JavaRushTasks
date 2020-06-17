package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface{
        private TableInterface concept;


        public TableInterfaceWrapper(TableInterface concept) {
            this.concept = concept;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            concept.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return concept.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            concept.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}