package ucf.assignments;

public class ItemsGUIController {
    package ucf.assignments;
    /*
     *  UCF COP3330 Summer 2021 Assignment 4 Solution
     *  Copyright 2021 Monil_Patel
     */
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;


    public class ItemsGUIController extends TodoGUIController /*inherits the primary window class so that we can edit the
    todolist selected by the user because the data is stored inside the file "appData.txt" and the file ius accessible through
    the TodoGUIController class*/

    {
        /* Declare attributes to control the secondary window :
        this window will have one todolist displayed along with its title and the items sored in it.
        User can add new new item,
        mark an item as completed
        delete an item
        display incomplete and complete items
        items will have a description, dueDate, completionDate, urgent, and completed as its attributes
            @FXML attributes:
            - SplitPane: mainPane, splitPane
            - TextField: descriptionText, newTitle
            - Button: completeButton, addItemButton, deleteButton
            - Label: errorLabel, title
            - Checkbox: noDueDateCheckbox, urgentCheckbox
            - ListView<Items_Of_TodoList>: taskItems, taskItemsDone
            - DatePicker: datePicker
            Normal Attributes:
            ObservableList<Items_Of_TodoList>: items , itemsDone .
        */

        @FXML
        void addNewItem(ActionEvent event)
        {
            /*
          if: we are allowed to add an item which does not repeat another item and is not empty
           [Use addItemValidate() for this purpose]
        -  call addItemCommit() to store the data
         */
        }

        private boolean addItemValidate()
        {
             /*
        if: user enters no description for an item
        - print error message: Cannot create an empty item
          return false
        else if: user chooses a date before the current date
        - print error message: Cannot create a task in the past
          return false
        if: there is duplicate item of same description [use isDuplicate()]
        - print error message: Cannot create a duplicate item
          return false
         else:
         - return true
         */

            return true;
        }

        private void addItemCommit()
        {
            /*
        get the text that user entered into text field
        create a new Items_Of_TodoList and set its description using constructor
        add this item to 'items'
        sort 'items': use sortListByDate() method
        add 'item' to 'taskItems' (Displays items in window)
        set the text field (descriptionText) and errorLabel to ""
        call toggleButtons() to enable all buttons.
        Enable all checkboxes and change the date to current date (datePicker)
         */

        }

        @FXML
        void markitemsAsComplete(ActionEvent event)
        {
            /*
        Create a null Items_Of_TodoList "task"
        if(the user selected from the incomplete items list)
        - set task to the item which the user selected
        else if(the user selected from the complete items list)
        - set task to the item which the user selected
        if(task is not null)
            - if(task is complete)
                - if(due date is before the current date)
                    print error msg: Cannot mark a task as incomplete if it's past the due date
                - else:
                    - remove task from complete items list
                    - add the task to incomplete items list
                    - sort the incomplete items list: use sortListByDate() method to sort 'items'
                    - update the taskItems using 'items'
            - else
                - remove task from incomplete items list
                - add the task to complete items list
                - update the task.completionDate to current date
                - sort the complete items list: use sortListByDate() method to sort 'itemsDone'
                - update the taskItemsDone using 'itemsDone'
         */


        }

        @FXML
        void deleteItem(ActionEvent event)
        {
            /*
        remove the user selected item: either from incomplete(left-side display) or complete items list(right-side display)
        use .remove()
        refresh the incomplete and the complete items list: use .refresh()
        call toggleButtons to enable or disable all the buttons
        clear the item in the display that the user wanted to delete : either from incomplete(left-side display) or complete items list(right-side display)
         */

        }

        @FXML
        void doneitemsListClicked(MouseEvent event) //If the right side displayed is being used
        {
            /*
        if(completed items list is not empty)
        - display "Mark as incomplete" on the completeButton
        if(completed items list is empty)
        - disable complete and delete button
        else
        - enable complete and delete button
        disable the urgentCheckBox
        display the completed items list on the right after refreshing
         */

        }

        @FXML
        void itemsListClicked(MouseEvent event) //If the left side displayed is being used
        {
            /*
        if(incomplete items list is not empty)
        - display "Mark as complete" on the completeButton
        if(incomplete items list is empty)
        - disable complete and delete button
        else
        - enable complete and delete button
        disable the urgentCheckBox
        display the incomplete items list on the right after refreshing
         */

        }

        @FXML
        void addItemClicked(MouseEvent event)
        {
            /*
            If instead of clicking on the button the user uses keyboard key Enter we use this method
            Enable the urgentCheckbox
            Create a new Scene in mainPane
            Check if the user pressed Enter key
            If he did then add item to 'items': use enterPressed() method
            */

        }

        @FXML
        void noDueDateSelected(ActionEvent event)
        {
            /*
              If(noDueDateCheckbox is selected)
              - disable datePicker
              else
              - enable datePicker
             */

        }

        @FXML
        void urgentSelected(ActionEvent event)
        {
            /*
            If(urgentCheckbox is selected)
              - disable noDueDateCheckbox
              - disable datePicker
              else
              - enable noDueDateCheckbox and keep it as selected
             */
        }


        @FXML
        public void initialize()
        {
            /*
       Initialize the primary window to be used
       Enable all the buttons and set the date of datePicker to current date
       Divide the pane into its parts and set positions
       Add scroll bar if there are many todolist in the display
       load all the previous items data stored in a ".txt" file if it exists
       use loadAppData()
       When user enters cross button: save all the new items data into the same .txt file we used before
       use saveAppData()
       the filename is named as follows : title of the todolist + .txt
        */
        }


        public void saveItemData()
        {

        /*
        Open an output file: we are going to write the data as a Byte stream
        The filename is as follows : title of the todolist + .txt
         - String filename = add_task.getTitle();
           filename += ".txt";
        Add both the incomplete items list and the items completed list to a file:
        Create a Todo_List object 'data' which stores both the items lists.
        Update the object's attributes :
        data.set_title(add_task.getTitle());
        data.setCompleted(add_task.isCompleted());
        Use for loop to iterate over the incomplete todolist 'list' (we have inherited this)
        If (title of 'data' equals the title of 'list' at index 'i')
           - update 'list' at index 'i' using 'data
           - update 'taskList' using 'list'
        Write the object to the file in bytes
        Use exception handling above
        After saving set add_task => null so we can use it again
         */

        }

        public void loadItemData()
        {
            /*
        Open the file".txt" : we are going to read the data stored as Byte stream
        the filename is stored as string = add_task.getTitle() + ".txt"
        because the filename is the title of the todolist we want to read the items from
        Read a new  Todo_List object from file
        Use this object and store the incomplete items list into 'items'
        and completed items list into 'itemsDone'
        Then use this to update the display lists: taskItems and taskItemsDone
        Use exception handling above
         */

        }


        public void sortListByDate(ObservableList<Items_Of_TodoList> items)
        {
            /*
            To sort items by date
            Use Collections.sort(items, new Comparator<Items_Of_TodoList>()
            Then compare Items_Of_TodoList t1 and Items_Of_TodoList t2 inside the comparator
                -if(t1 is urgent)
                 return -1
                -else if(t2 is urgent)
                 return 1
                -if(t1 has no due date)
                 return 1
                -else if(t2 has no due date)
                 return -1
                -if(t1 due date after/equal to t2 due date)
                 return 1
                -if(t1 due date before t2 due date)
                 return -1
                 return 0;
             */
            Collections.sort(items, new Comparator<Items_Of_TodoList>()
            {
                @Override
                public int compare(Items_Of_TodoList t1, Items_Of_TodoList t2)
                {

                    if(t1.isUrgent())
                    {
                        return -1;
                    }else if(t2.isUrgent())
                    {
                        return 1;
                    }

                    if( t1.getDueDate() == null )
                    {
                        return 1;
                    }else if( t2.getDueDate() == null )
                    {
                        return -1;
                    }

                    if( t1.getDueDate().isAfter(t2.getDueDate()) ||
                            t1.getDueDate().isEqual(t2.getDueDate()) )
                    {
                        return 1;
                    }
                    if( t1.getDueDate().isBefore(t2.getDueDate()) )
                    {
                        return -1;
                    }
                    return 0;
                }
            });
        }

        private void toggleButtons(boolean itemsEmpty)
        {
            /*
        disable or enable the buttons:
        completeButton
        deleteButton
        addItemButton
        based on boolean variable which tells if lists are empty or not.
         */
        }

        private boolean isDuplicate()
        {
            /*
        Use for loop to iterate over the incomplete items list
        -  if(the description that user entered equals the description of the item at index 'i')
             - if(datePicker is disabled)
               - if(item at index 'i' has no due date or is null)
                      it means we cannot add this list because one already exists
                       so return true
              -else(datePicker is enabled)
                 - if(item at index 'i' is not null and is equal to the datePicker's value)
                       it means we cannot add this list because one already exists
                       so return true
        - else return false
         */

            return false;
        }

        private void printError(String text)
        {
           /*
         set the errorLabel to the text received as parameter
         set the color of errorLabel to red
         */
        }

        private void enterPressed()
        {
            /*
        If the user pressed enter while adding a new item
        and if the description has been entered for a new item
        call addNewItem(null)
         */
        }


        public void addNewTitleEntered(KeyEvent keyEvent) //edit the title of todo_list
        {
            /*
            if(enter key is pressed)
            set String str = title entered by the user
            update the text of the label 'title' with str
            update add_task's title with str: use add_task.set_title()
             */
        }

    }


}
