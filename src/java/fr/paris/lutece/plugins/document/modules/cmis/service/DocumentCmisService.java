/*
 * Copyright (c) 2002-2012, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.document.modules.cmis.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.apache.chemistry.opencmis.commons.data.*;
import org.apache.chemistry.opencmis.commons.definitions.TypeDefinition;
import org.apache.chemistry.opencmis.commons.definitions.TypeDefinitionList;
import org.apache.chemistry.opencmis.commons.enums.IncludeRelationships;
import org.apache.chemistry.opencmis.commons.impl.server.AbstractCmisService;

/**
 *
 * @author levy
 */
public class DocumentCmisService extends AbstractCmisService
{
    private static DocumentRepository _repository;

    @Override
    public List<RepositoryInfo> getRepositoryInfos(ExtensionsData extension)
    {
        List<RepositoryInfo> list = new ArrayList<RepositoryInfo>();
        list.add( _repository.getInfos() );
        return list;
    }

    @Override
    public TypeDefinitionList getTypeChildren(String repositoryId, String typeId, Boolean includePropertyDefinitions, BigInteger maxItems, BigInteger skipCount, ExtensionsData extension)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TypeDefinition getTypeDefinition(String repositoryId, String typeId, ExtensionsData extension)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ObjectInFolderList getChildren(String repositoryId, String folderId, String filter, String orderBy, Boolean includeAllowableActions, IncludeRelationships includeRelationships, String renditionFilter, Boolean includePathSegment, BigInteger maxItems, BigInteger skipCount, ExtensionsData extension)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<ObjectParentData> getObjectParents(String repositoryId, String objectId, String filter, Boolean includeAllowableActions, IncludeRelationships includeRelationships, String renditionFilter, Boolean includeRelativePathSegment, ExtensionsData extension)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ObjectData getObject(String repositoryId, String objectId, String filter, Boolean includeAllowableActions, IncludeRelationships includeRelationships, String renditionFilter, Boolean includePolicyIds, Boolean includeAcl, ExtensionsData extension)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
