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
public class _ParameterFactoryStub extends org.omg.CORBA.portable.ObjectImpl
                                   implements ParameterFactory
{
    private static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfParameterMgr/ParameterFactory:1.0",
        "IDL:iris.edu/Fissures/IfParameterMgr/ParameterComponent:1.0"
    };

    public String[]
    _ids()
    {
        return _ob_ids_;
    }

    final public static java.lang.Class _ob_opsClass = ParameterFactoryOperations.class;

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParameterComponent/a_parmset_finder:1.0
    //
    public ParmSetFinder
    a_parmset_finder()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("_get_a_parmset_finder", true);
                    in = _invoke(out);
                    ParmSetFinder _ob_r = ParmSetFinderHelper.read(in);
                    return _ob_r;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("a_parmset_finder", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                ParameterFactoryOperations _ob_self = (ParameterFactoryOperations)_ob_so.servant;
                try
                {
                    return _ob_self.a_parmset_finder();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParameterComponent/a_parm__mgr:1.0
    //
    public ParameterMgrAccess
    a_parm__mgr()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("_get_a_parm__mgr", true);
                    in = _invoke(out);
                    ParameterMgrAccess _ob_r = ParameterMgrAccessHelper.read(in);
                    return _ob_r;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("a_parm__mgr", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                ParameterFactoryOperations _ob_self = (ParameterFactoryOperations)_ob_so.servant;
                try
                {
                    return _ob_self.a_parm__mgr();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParameterFactory/generate_id:1.0
    //
    public String
    generate_id()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("generate_id", true);
                    in = _invoke(out);
                    String _ob_r = ParameterIdHelper.read(in);
                    return _ob_r;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    in = _ob_aex.getInputStream();

                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("generate_id", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                ParameterFactoryOperations _ob_self = (ParameterFactoryOperations)_ob_so.servant;
                try
                {
                    return _ob_self.generate_id();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }
}