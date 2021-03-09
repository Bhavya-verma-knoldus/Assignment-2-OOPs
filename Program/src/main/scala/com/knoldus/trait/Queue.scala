// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.knoldus.`trait`

trait Queue {
  /*enqueue abstract method to add element at the end of the queue*/
  def enqueue(list: List[Int], value: Int): List[Int]

  /*dequeue method to remove the element from the front of the queue*/
  def dequeue(list: List[Int]): List[Int] = list match {

    /*Throws exception when queue is empty*/
    case Nil => throw new NoSuchElementException("Queue is empty")

    /*Returns empty list if list has only 1 element*/
    case head :: Nil => List()

    /*Removes element from the front of the queue */
    case head :: tail => tail
  }
}
