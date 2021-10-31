package ucf.assignments;

import java.io.Serializable;
import java.time.LocalDate;

public class Items_Of_TodoList {
    package ucf.assignments;
    /*
     *  UCF COP3330 Summer 2021 Assignment 4 Solution
     *  Copyright 2021 Monil_Patel
     */
import java.io.Serializable;
import LocalDate;
/*
Class template as per the requirements of this assignment
 */

    public class Items_Of_TodoList implements Serializable //To convert into byte stream
    {
    /*
    Declare the attributes:
    dueDate: LocalDate
    completionDate: LocalDate
    description: String
    completed: boolean
    urgent: boolean
     */


        public Items_Of_TodoList(String description, LocalDate date, boolean urgent)
        {
        /*
        Constructor to initialize description, date, and urgent based on the received parameters
        set completionDate to null
        set completed to false
        This is because this is a new entry
         */

        }

        @Override
        public String toString()
        {
        /*
        String[] array : dateArray and completionDateArray
        if(dueDate is not null)
        -add dueDate to dateArray (convert to string and split on the basis of "-")
        if(completionDate is not null)
        -add completionDate to completionDateArray (convert to string and split on the basis of "-")
        if(item is urgent)
        -  if(item is completed)
           - return string completionDateArray + description
        -  else
           - return string "urgent" + description
        else(item's not urgent)
        -  if(item is completed)
           - return string completionDateArray + description + dateArray
        -  else
           - return string dateArray + description
                    */
            return null;
        }

        public LocalDate getCompletionDate()
        {
        /*
        return completionDate
         */
            return null;
        }

        public void setCompletionDate(LocalDate completionDate)
        {
        /*
        initialize completionDate (this)
         */
        }

        public boolean isUrgent()
        {
        /*
        return urgent
         */
            return false;
        }

        public void setUrgent(boolean urgent)
        {
        /*
        initialize urgent (this)
         */

        }

        public LocalDate getDueDate()
        {
        /*
        return dueDate
         */
            return null;
        }

        public void setDueDate(LocalDate dueDate)
        {
        /*
        initialize dueDate (this)
         */
        }

        public String getDescription()
        {
                /*
        return description
         */
            return null;
        }

        public void setDescription(String description)
        {
        /*
        initialize description (this)
         */
        }

        public boolean isCompleted()
        {
             /*
        return completed (this)
         */
            return false;
        }

        public void setCompleted(boolean completed)
        {
                /*
        initialize completed (this)
         */
        }
    }
}
