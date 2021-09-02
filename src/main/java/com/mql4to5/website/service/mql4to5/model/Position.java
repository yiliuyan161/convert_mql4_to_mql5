package com.mql4to5.website.service.mql4to5.model;

import java.util.Objects;

/**
 * segment Position
 */
public class Position implements Comparable<Position>{
        public Integer start;
        public Integer end;

        public Position(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Position position = (Position) o;
            return start == position.start &&
                    end == position.end;
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, end);
        }

        @Override
        public int compareTo(Position o) {
            return this.start.compareTo(o.start);
        }
    }