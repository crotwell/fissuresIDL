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

package edu.iris.Fissures.IfSeismogramMgr;

//
// IDL:iris.edu/Fissures/IfSeismogramMgr/ChannelMirrorRegistry:1.0
//
public class _ChannelMirrorRegistryStub extends org.omg.CORBA.portable.ObjectImpl
                                        implements ChannelMirrorRegistry
{
    private static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfSeismogramMgr/ChannelMirrorRegistry:1.0",
    };

    public String[]
    _ids()
    {
        return _ob_ids_;
    }

    final public static java.lang.Class _ob_opsClass = ChannelMirrorRegistryOperations.class;

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/ChannelMirrorRegistry/register:1.0
    //
    public String
    register(MirrorFactory _ob_a0,
             edu.iris.Fissures.IfNetwork.ChannelId[] _ob_a1)
        throws UnknownChannel,
               NotMirroring
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("register", true);
                    MirrorFactoryHelper.write(out, _ob_a0);
                    ChannelIdSeqHelper.write(out, _ob_a1);
                    in = _invoke(out);
                    String _ob_r = MirrorIdHelper.read(in);
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

                    if(_ob_id.equals(UnknownChannelHelper.id()))
                        throw UnknownChannelHelper.read(in);
                    if(_ob_id.equals(NotMirroringHelper.id()))
                        throw NotMirroringHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("register", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                ChannelMirrorRegistryOperations _ob_self = (ChannelMirrorRegistryOperations)_ob_so.servant;
                try
                {
                    return _ob_self.register(_ob_a0, _ob_a1);
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/ChannelMirrorRegistry/unregister:1.0
    //
    public void
    unregister(String _ob_a0)
        throws UnknownMirrorId
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("unregister", true);
                    MirrorIdHelper.write(out, _ob_a0);
                    in = _invoke(out);
                    return;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    in = _ob_aex.getInputStream();

                    if(_ob_id.equals(UnknownMirrorIdHelper.id()))
                        throw UnknownMirrorIdHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("unregister", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                ChannelMirrorRegistryOperations _ob_self = (ChannelMirrorRegistryOperations)_ob_so.servant;
                try
                {
                    _ob_self.unregister(_ob_a0);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/ChannelMirrorRegistry/get_mirrorable_channels:1.0
    //
    public edu.iris.Fissures.IfNetwork.ChannelId[]
    get_mirrorable_channels()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("get_mirrorable_channels", true);
                    in = _invoke(out);
                    edu.iris.Fissures.IfNetwork.ChannelId[] _ob_r = ChannelIdSeqHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_mirrorable_channels", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                ChannelMirrorRegistryOperations _ob_self = (ChannelMirrorRegistryOperations)_ob_so.servant;
                try
                {
                    return _ob_self.get_mirrorable_channels();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }
}
