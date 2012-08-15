/*
 * Copyright 2000-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.intellijeval.toolwindow.fileChooser;

import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;


public interface FileSystemTreeFactory {

  FileSystemTree createFileSystemTree(Project project, FileChooserDescriptor fileChooserDescriptor);

  DefaultActionGroup createDefaultFileSystemActions(FileSystemTree fileSystemTree);

  class SERVICE {
    private SERVICE() {
    }

    public static ru.intellijeval.toolwindow.fileChooser.FileSystemTreeFactory getInstance() {
      return ServiceManager.getService(ru.intellijeval.toolwindow.fileChooser.FileSystemTreeFactory.class);
    }
  }
}