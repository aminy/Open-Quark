/*
 * Copyright (c) 2007 BUSINESS OBJECTS SOFTWARE LIMITED
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 *     * Redistributions of source code must retain the above copyright notice,
 *       this list of conditions and the following disclaimer.
 * 
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 * 
 *     * Neither the name of Business Objects nor the names of its contributors
 *       may be used to endorse or promote products derived from this software
 *       without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */


/*
 * UserResourceFileStore.java
 * Creation date: Jun 2, 2006.
 * By: Joseph Wong
 */
package org.openquark.cal.services;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openquark.cal.compiler.ModuleName;


/**
 * A user resource store using files and directories in the file system.
 * A user resource is a resource whose exact format is determined by the user code,
 * and not managed by the platform.
 *
 * @author Joseph Wong
 */
class UserResourceFileStore extends ResourceFileStore.Module implements UserResourceStore {

    /**
     * Constructor for a UserResourceFileStore.
     * @param rootDirectory the directory under which the resource folder resides.
     */
    public UserResourceFileStore(File rootDirectory) {
        super(rootDirectory, WorkspaceResource.USER_RESOURCE_TYPE, UserResourcePathMapper.INSTANCE);
    }
    
    /**
     * {@inheritDoc}
     */
    public Set<ModuleName> getModuleNames() {
        Set<ResourcePath.Folder> moduleResourcePaths =
            FileSystemResourceHelper.getResourcePathsOfAllNonEmptySubdirectories(getPathMapper().getBaseResourceFolder(), getRootDirectory(), getPathMapper());
        
        Set<ModuleName> moduleNames = new HashSet<ModuleName>();
        for (final ResourcePath.Folder moduleResourcePath : moduleResourcePaths) {
            moduleNames.add(((ResourcePathMapper.Module)getPathMapper()).getModuleNameFromResourcePath(moduleResourcePath));
        }
        
        return moduleNames;
    }
    
    /**
     * {@inheritDoc}
     */
    public List<ResourceName> getModuleResourceNameList(ModuleName moduleName) {
        return UserResourcePathStoreHelper.getModuleResourceNameList(this, moduleName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeModuleResources(ModuleName moduleName, Status removeStatus) {
        removeFilesOfResourcesInModule(moduleName, removeStatus);
    }
}
