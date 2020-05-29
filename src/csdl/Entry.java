/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdl;

/**
 *
 * @author Admin
 */
public class Entry<R,V> {

        private R rank;
        private V value;

        public Entry(R rank, V value) {
            this.rank = rank;
            this.value = value;
        }

        public R getRank() {
            return rank;
        }

        public void setRank(R rank) {
            this.rank = rank;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "(" + rank + " , " + value + ")";
        }
}
