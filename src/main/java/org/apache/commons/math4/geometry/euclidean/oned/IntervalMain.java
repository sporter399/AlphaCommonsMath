/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * The main below is a main class to test and observe the methods in
 * Interval.java
 */
package alphamain;

import org.apache.commons.math4.geometry.euclidean.oned.Interval;
import org.apache.commons.math4.geometry.partitioning.Region.Location;



public class IntervalMain { 
    public static void main(String[] args) {
        System.out.println("In IntervalMain class - BGN");
        System.out.println();

        System.out.println("=========Constructor");
        Interval interval = new Interval(2.3, 5.7);

        System.out.println("=========getInf()");
        System.out.println("getInf()="+interval.getInf());

        System.out.println("=========getSup()");
        System.out.println("getSup()="+interval.getSup());

        System.out.println("=========getSize()");
        System.out.println("getSize()="+interval.getSize());

        System.out.println("=========getBarycenter()");
        System.out.println("getBarycenter()="+interval.getBarycenter());

        System.out.println("=========checkPoint() & location");
        Location location = interval.checkPoint(9.0, Double.POSITIVE_INFINITY);
        System.out.println("Location="+location);

        System.out.println();
        System.out.println("In IntervalMain class - END");
    }
}



