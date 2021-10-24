package ucf.assignments;

public class TodoGUIController {
    package ucf.assignments;
    /*
     *  UCF COP3330 Summer 2021 Assignment 4 Solution
     *  Copyright 2021 Monil_Patel
     */

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;


    public static class TodoGUIController
    {
    /* Declare attributes to control the primary window :
    this window will have the todolist displayed along with its title.
    User can add new todolist,
    mark a todolist as completed
    delete a todolist
    select a todolist and add items to it: use a secondary window
    display incomplete and complete todolist
     @FXML attributes:
     - SplitPane: mainPane, splitPane
     - TextField: titleText
     - Button: completeButton, addItemsButton, deleteButton
     - Label: errorLabel
     - ListView<Todo_List>: taskList, taskListDone
      Normal Attributes:
      ObservableList<Todo_List>: list , listDone .
      Todo_List: add_task => null;
     */


        @FXML
        void addNewTask(ActionEvent event)
        {
        /*
        if: we are allowed to make a list which does not repeat another list and is not empty
        [Use addTaskValidate() for this purpose]
        -  call addTaskCommit()
         */

        }

        private boolean addTaskValidate()
        {
        /*
        if: user enters no title for a list
        - print error message: Cannot create an empty task
          return false
        if: there is duplicate list of same title [use isDuplicate()]
        - print error message: Cannot create a duplicate task
          return false
         else:
         - return true
         */

            return false;
        }

        private void addTaskCommit()
        {
        /*
        get the text that user entered into text field
        create a new Todo_List and set its title using constructor
        add this list to 'list'
        add 'list' to 'taskList' (Displays todolist in window)
        set the text field (titleText) and errorLabel to ""
        call toggleButtons() to enable all buttons
         */

        }

        @FXML
        void markAsComplete(ActionEvent event)
        {
        /*
        Create a null Todo_List named "task"
        if(the user selected from the incomplete list)
        - set task to the list which the user selected
        else if(the user selected from the complete list()
        - set task to the list which the user selected
        if(task is not null)
        - if(task is complete)
            - remove task from complete list
            - add the task to incomplete list
            - update the taskList
        - else
            - remove task from incomplete list
            - add the task to complete list
            - update the taskListDone
         */

        }

        @FXML
        void addItems(ActionEvent actionEvent)
        {
      /*
      set add_task = list user selected
      this list is the one that the user wants to add items to
      Open ItemsGUI.fxml into Parent root1
      Set new Scene and Stage
      Open the secondary window where the user can do stuff with the items in the selected todolist
      Use exception handling above
      */


        }


        @FXML
        void deleteTask(ActionEvent event)
        {
        /*
        remove the user selected list: either from incomplete(left-side display) or complete list(right-side display)
        use .remove()
        refresh the incomplete and the complete list: use .refresh()
        call toggleButtons to enable or disable all the buttons
        clear the list in the display that the user wanted to delete : either from incomplete(left-side display) or complete list(right-side display)
         */
        }

        @FXML
        void doneListClicked(MouseEvent event) //If the right side displayed is being used
        {
        /*
        if(completed list is not empty)
        - display "Mark as incomplete" on the completeButton
        if(completed list is empty)
        - disable complete and delete button
        else
        - enable complete and delete button
        disable the addItemsButton
        display the completed list on the right after refreshing
         */

        }

        @FXML
        void listClicked(MouseEvent event) //If the left side displayed is being used
        {
        /*
        if(incomplete list is not empty)
        - display "Mark as complete" on the completeButton
        if(incomplete list is empty)
        - disable complete and delete button
        else
        - enable complete and delete button
        enable the addItemsButton
        display the incomplete list on the left after refreshing
         */
        }

        @FXML
        void addTaskClicked(MouseEvent event)
        {
       /*
       If instead of clicking on the button the user uses keyboard key Enter we use this method
       Create a new Scene in mainPane
       Check if the user pressed Enter key
       If he did then add task to the todolist: use enterPressed() method
        */

        }



        @FXML
        public void initialize()
        {
       /*
       Initialize the primary window to be used
       Enable all the buttons
       Divide the pane into its parts and set positions
       Add scroll bar if there are many todolist in the display
       load all the previous todolist data stored in a .txt file if it exists
       use loadAppData()
       When user enters cross button: save all the new todolist data into the same .txt file we used before
       use saveAppData()
        */

        }


        public void saveAppData()
        {
        /*
        Open an output file: we are going to write the data as a Byte stream
        Add both the incomplete list and the completed list to a file named: "appData.txt"
        Create a AppData object which stores both the lists.
        Write the object to the file in bytes
        Use exception handling above
         */

        }

        public void loadAppData()
        {
        /*
        Open the file"appData.txt" : we are going to read the data stored as Byte stream
        Read a new AppData object from file
        Use this object and store the incomplete list into 'list'
        and completed list into 'listDone'
        Then use this to update the display lists: taskList and taskListDone
        Use exception handling above
         */

        }




        private void toggleButtons(boolean listsEmpty)
        {
        /*
        disable or enable the buttons:
        completeButton
        deleteButton
        addItemsButton
        based on boolean variable which tells if lists are empty or not.
         */
        }

        private boolean isDuplicate()
        {
        /*
        Use for loop to iterate over the incomplete list
        -  if(the title that user entered equals the title of list at index 'i')
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
        If the user pressed enter while adding a new task
        and if the title has been entered for a new task
        call addNewTask(null)
         */

        }


    }
}
