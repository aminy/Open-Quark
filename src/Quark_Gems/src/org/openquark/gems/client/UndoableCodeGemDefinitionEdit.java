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
 * UndoableCodeGemDefinitionEdit.java
 * Creation date: May 20, 2004.
 * By: Edward Lam
 */
package org.openquark.gems.client;

import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.StateEdit;
import javax.swing.undo.UndoableEdit;


/**
 * An UndoableEdit used to undo an edit to the definition of a code gem via the CodeGemEditor.
 * @author Edward Lam
 */
public class UndoableCodeGemDefinitionEdit extends AbstractUndoableEdit {

    private static final long serialVersionUID = -4040354393347082910L;

    /** The gem graph. */    
    private final GemGraph gemGraph;
    
    /** An UndoableEdit representing the change in the code gem before its arguments were updated. */
    private final UndoableEdit codeGemEdit;

    /** A StateEdit representing the change in the collector arguments and emitter inputs. */
    private final StateEdit collectorArgumentStateEdit;

    /**
     * Constructor for an UndoableCodeGemDefinitionEdit.
     * @param gemGraph the gem graph containing the code gem.
     * @param codeGemEdit an UndoableEdit representing the change in the code gem before its arguments were updated.
     * @param collectorArgumentStateEdit a StateEdit representing the change in the collector arguments and emitter inputs,
     *   or null if there was no relevant change.
     */
    public UndoableCodeGemDefinitionEdit(GemGraph gemGraph, UndoableEdit codeGemEdit, StateEdit collectorArgumentStateEdit) {
        this.gemGraph = gemGraph;
        this.codeGemEdit = codeGemEdit;
        
        collectorArgumentStateEdit.end();
        this.collectorArgumentStateEdit = collectorArgumentStateEdit;
    }

    /**
     * A reasonable name for this edit.
     */
    @Override
    public String getPresentationName() {
        return GemCutter.getResourceString("UndoText_CodeChange");
    }

    /**
     * Redo the edit.
     */
    @Override
    public void redo() {
        super.redo();
        gemGraph.setArgumentUpdatingDisabled(true);
        codeGemEdit.redo();
        if (collectorArgumentStateEdit != null) {
            collectorArgumentStateEdit.redo();
        }
        gemGraph.setArgumentUpdatingDisabled(false);
    }

    /**
     * Undo the edit.
     */
    @Override
    public void undo() {
        super.undo();
        gemGraph.setArgumentUpdatingDisabled(true);
        if (collectorArgumentStateEdit != null) {
            collectorArgumentStateEdit.undo();
        }
        codeGemEdit.undo();
        gemGraph.setArgumentUpdatingDisabled(false);
    }
}
