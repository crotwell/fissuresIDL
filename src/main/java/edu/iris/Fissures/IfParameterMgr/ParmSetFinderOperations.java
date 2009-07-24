// **********************************************************************
//
// Generated by the ORBacus IDL to Java Translator
//
// Copyright (c) 2000
// Object Oriented Concepts, Inc.
// Billerica, MA, USA
//
// All Rights Reserved
//
// **********************************************************************

// Version: 4.0.5

package edu.iris.Fissures.IfParameterMgr;

//
// IDL:iris.edu/Fissures/IfParameterMgr/ParmSetFinder:1.0
//
/**
 * The ParmSetFinder provides the ability to find a ParmSet. A
 * ParmSet is a user defined collection of parameters.
 **/

public interface ParmSetFinderOperations extends ParameterComponentOperations
{
    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSetFinder/a_factory:1.0
    //
    /***/

    ParmSetFactory
    a_factory();

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSetFinder/get_parm_set_by_name:1.0
    //
    /***/

    ParmSetAccess
    get_parm_set_by_name(String a_name)
        throws edu.iris.Fissures.FissuresException;

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSetFinder/get_parm_sets_by_creator:1.0
    //
    /***/

    ParmSet[]
    get_parm_sets_by_creator(int how_many,
                             ParmSetIteratorHolder rest);

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSetFinder/find_defined_parm_names:1.0
    //
    /***/

    String[]
    find_defined_parm_names(int how_many,
                            ParameterNameIteratorHolder rest);

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSetFinder/find_all_parm_defs:1.0
    //
    /***/

    ParmDef[]
    find_all_parm_defs(int how_many,
                       ParameterDefIteratorHolder rest);

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSetFinder/find_all_parm_def_by_creator:1.0
    //
    /***/

    ParmDef[]
    find_all_parm_def_by_creator(String creator,
                                 int how_many,
                                 ParameterDefIteratorHolder rest);

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSetFinder/find_parm_def:1.0
    //
    /***/

    ParmDef
    find_parm_def(String name)
        throws edu.iris.Fissures.FissuresException;
}