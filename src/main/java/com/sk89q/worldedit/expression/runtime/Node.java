// $Id$
/*
 * WorldEdit
 * Copyright (C) 2010, 2011 sk89q <http://www.sk89q.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package com.sk89q.worldedit.expression.runtime;

/**
 * A node in the execution tree of an expression.
 *
 * @author TomyLobo
 */
public abstract class Node implements RValue {
    private final int position;

    public Node(int position) {
        this.position = position;
    }

    @Override
    public abstract String toString();

    public RValue optimize() throws EvaluationException {
        return this;
    }

    @Override
    public final int getPosition() {
        return position;
    }
}
