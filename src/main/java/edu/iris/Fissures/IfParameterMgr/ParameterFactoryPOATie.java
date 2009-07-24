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
// IDL:iris.edu/Fissures/IfParameterMgr/ParameterFactory:1.0
//
public class ParameterFactoryPOATie extends ParameterFactoryPOA
{
    private ParameterFactoryOperations _ob_delegate_;
    private org.omg.PortableServer.POA _ob_poa_;

    public
    ParameterFactoryPOATie(ParameterFactoryOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public
    ParameterFactoryPOATie(ParameterFactoryOperations delegate, org.omg.PortableServer.POA poa)
    {
        _ob_delegate_ = delegate;
        _ob_poa_ = poa;
    }

    public ParameterFactoryOperations
    _delegate()
    {
        return _ob_delegate_;
    }

    public void
    _delegate(ParameterFactoryOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public org.omg.PortableServer.POA
    _default_POA()
    {
        if(_ob_poa_ != null)
            return _ob_poa_;
        else
            return super._default_POA();
    }

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParameterComponent/a_parmset_finder:1.0
    //
    public ParmSetFinder
    a_parmset_finder()
    {
        return _ob_delegate_.a_parmset_finder();
    }

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParameterComponent/a_parm__mgr:1.0
    //
    public ParameterMgrAccess
    a_parm__mgr()
    {
        return _ob_delegate_.a_parm__mgr();
    }

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParameterFactory/generate_id:1.0
    //
    public String
    generate_id()
    {
        return _ob_delegate_.generate_id();
    }
}