/*
 * Copyright 2011 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.oose.taskboard.client.view;

import java.util.Map;

import com.google.gwt.event.logical.shared.HasSelectionHandlers;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.VerticalPanel;

import de.oose.taskboard.client.widget.TaskCellList;
import de.oose.taskboard.client.widget.Taskboard;
import de.oose.taskboard.shared.bo.TaskBO;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;

/**
 * Sample implementation of {@link TaskView}.
 */
public class TaskListView extends VerticalPanel {

	private Taskboard taskboard;

	private Button btnTask;
	private Label lblUser;
	private Button btnLogout;

	public String getUser() {
		return lblUser.getText();
	}

	public void setUser(String lblUser) {
		this.lblUser.setText(lblUser);
		
	}

	public TaskListView() {
		setSpacing(5);
		setSize("800", "600");
		
		HorizontalPanel horizontalPanel = new HorizontalPanel();
		horizontalPanel.setSpacing(5);
		add(horizontalPanel);
		horizontalPanel.setWidth("100%");
		setCellWidth(horizontalPanel, "100%");

		lblUser = new Label("userlabel");
		horizontalPanel.add(lblUser);
		horizontalPanel.setCellWidth(lblUser, "20%");
		
		btnLogout = new Button("New button");
		btnLogout.setText("Logout");
		horizontalPanel.add(btnLogout);
		horizontalPanel.setCellWidth(btnLogout, "100%");
		horizontalPanel.setCellHorizontalAlignment(btnLogout, HasHorizontalAlignment.ALIGN_RIGHT);

		taskboard = new Taskboard();
		add(taskboard);

		btnTask = new Button("New button");
		add(btnTask);
		btnTask.setText("New Task");

	}

	public Button getTaskButton() {
		return btnTask;
	}

	public Button getBtnLogout() {
		return btnLogout;
	}

	public HasSelectionHandlers<TaskBO> getTaskboard() {
		return taskboard;
	}

	public Map<String, TaskCellList> getFilteredCellLists() {
		return taskboard.getFilteredCellLists();
	}

}
