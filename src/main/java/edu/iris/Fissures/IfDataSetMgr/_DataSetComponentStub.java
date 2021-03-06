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

package edu.iris.Fissures.IfDataSetMgr;

//
// IDL:iris.edu/Fissures/IfDataSetMgr/DataSetComponent:1.0
//
public class _DataSetComponentStub extends org.omg.CORBA.portable.ObjectImpl
                                   implements DataSetComponent
{
    private static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfDataSetMgr/DataSetComponent:1.0",
    };

    public String[]
    _ids()
    {
        return _ob_ids_;
    }

    final public static java.lang.Class _ob_opsClass = DataSetComponentOperations.class;

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetComponent/a_finder:1.0
    //
    public DataSetFinder
    a_finder()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("_get_a_finder", true);
                    in = _invoke(out);
                    DataSetFinder _ob_r = DataSetFinderHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("a_finder", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                DataSetComponentOperations _ob_self = (DataSetComponentOperations)_ob_so.servant;
                try
                {
                    return _ob_self.a_finder();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetComponent/a_factory:1.0
    //
    public DataSetFactory
    a_factory()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("_get_a_factory", true);
                    in = _invoke(out);
                    DataSetFactory _ob_r = DataSetFactoryHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("a_factory", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                DataSetComponentOperations _ob_self = (DataSetComponentOperations)_ob_so.servant;
                try
                {
                    return _ob_self.a_factory();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }
}
