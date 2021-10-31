package ucf.assignments;

import java.io.Serializable;

public class Todo_List {
    package ucf.assignments;
    /*
     *  UCF COP3330 Summer 2021 Assignment 4 Solution
     *  Copyright 2021 Monil_Patel
     */

import java.io.Serializable;
import java.util.ArrayList;

/*
Class template as per the requirements of this assignment
 */

    public class Todo_List implements Serializable //To convert into byte stream
    {
    /*
    Declare attributes:
    - title: String
    - completed: boolean
    - items: ArrayList<Items_Of_TodoList>
    - itemsDone: ArrayList<Items_Of_TodoList>
     */

        public Todo_List(String title)
        {
        /*
        Constructor to initialize title
         */

        }
        public Todo_List(ArrayList<Items_Of_TodoList> items, ArrayList<Items_Of_TodoList> itemsDone)
        {
        /*
        Constructor to initialize items and itemsDone
         */

        }

        public void set_title(String title)
        {
        /*
        Method to initialize title. This will not be called automatically.
         */

        }
        public void set_Items(ArrayList<Items_Of_TodoList> items, ArrayList<Items_Of_TodoList> itemsDone)
        {
        /*
        Method to initialize items and itemsDone. This will not be called automatically.
         */
        }
        public ArrayList<Items_Of_TodoList> getList()
        {
        /*
        return items
         */
            return null;
        }

        public ArrayList<Items_Of_TodoList> getListDone()
        {
        /*
        return itemsDone
         */
            return null;
        }

        public String getTitle()
        {
        /*
        return title
         */
            return null;
        }

        public boolean isCompleted()
        {
        /*
        return completed
         */
            return false;
        }

        public void setCompleted(boolean completed)
        {
        /*
        Method to initialize completed (true or false).
         */
        }

        @Override
        public String toString()
        {
        /*
        return the title after overriding the title that has been converted into byte stream.
        We want the title to be displayed in a user-readable language.
         */
            return this.getTitle();
        }

    }
}
