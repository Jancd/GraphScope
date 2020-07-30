//
//! Copyright 2020 Alibaba Group Holding Limited.
//! 
//! Licensed under the Apache License, Version 2.0 (the "License");
//! you may not use this file except in compliance with the License.
//! You may obtain a copy of the License at
//! 
//!     http://www.apache.org/licenses/LICENSE-2.0
//! 
//! Unless required by applicable law or agreed to in writing, software
//! distributed under the License is distributed on an "AS IS" BASIS,
//! WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//! See the License for the specific language governing permissions and
//! limitations under the License.

// This file is generated by rust-protobuf 2.0.6. Do not edit
// @generated

// https://github.com/Manishearth/rust-clippy/issues/702
#![allow(unknown_lints)]
#![allow(clippy)]

#![cfg_attr(rustfmt, rustfmt_skip)]

#![allow(box_pointers)]
#![allow(dead_code)]
#![allow(missing_docs)]
#![allow(non_camel_case_types)]
#![allow(non_snake_case)]
#![allow(non_upper_case_globals)]
#![allow(trivial_casts)]
#![allow(unsafe_code)]
#![allow(unused_imports)]
#![allow(unused_results)]

use protobuf::Message as Message_imported_for_functions;
use protobuf::ProtobufEnum as ProtobufEnum_imported_for_functions;

#[derive(PartialEq,Clone,Default)]
pub struct RpcAddressProto {
    // message fields
    pub host: ::std::string::String,
    pub port: i32,
    pub version: i64,
    // special fields
    unknown_fields: ::protobuf::UnknownFields,
    cached_size: ::protobuf::CachedSize,
}

impl RpcAddressProto {
    pub fn new() -> RpcAddressProto {
        ::std::default::Default::default()
    }

    // string host = 1;

    pub fn clear_host(&mut self) {
        self.host.clear();
    }

    // Param is passed by value, moved
    pub fn set_host(&mut self, v: ::std::string::String) {
        self.host = v;
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_host(&mut self) -> &mut ::std::string::String {
        &mut self.host
    }

    // Take field
    pub fn take_host(&mut self) -> ::std::string::String {
        ::std::mem::replace(&mut self.host, ::std::string::String::new())
    }

    pub fn get_host(&self) -> &str {
        &self.host
    }

    // int32 port = 2;

    pub fn clear_port(&mut self) {
        self.port = 0;
    }

    // Param is passed by value, moved
    pub fn set_port(&mut self, v: i32) {
        self.port = v;
    }

    pub fn get_port(&self) -> i32 {
        self.port
    }

    // int64 version = 3;

    pub fn clear_version(&mut self) {
        self.version = 0;
    }

    // Param is passed by value, moved
    pub fn set_version(&mut self, v: i64) {
        self.version = v;
    }

    pub fn get_version(&self) -> i64 {
        self.version
    }
}

impl ::protobuf::Message for RpcAddressProto {
    fn is_initialized(&self) -> bool {
        true
    }

    fn merge_from(&mut self, is: &mut ::protobuf::CodedInputStream) -> ::protobuf::ProtobufResult<()> {
        while !is.eof()? {
            let (field_number, wire_type) = is.read_tag_unpack()?;
            match field_number {
                1 => {
                    ::protobuf::rt::read_singular_proto3_string_into(wire_type, is, &mut self.host)?;
                },
                2 => {
                    if wire_type != ::protobuf::wire_format::WireTypeVarint {
                        return ::std::result::Result::Err(::protobuf::rt::unexpected_wire_type(wire_type));
                    }
                    let tmp = is.read_int32()?;
                    self.port = tmp;
                },
                3 => {
                    if wire_type != ::protobuf::wire_format::WireTypeVarint {
                        return ::std::result::Result::Err(::protobuf::rt::unexpected_wire_type(wire_type));
                    }
                    let tmp = is.read_int64()?;
                    self.version = tmp;
                },
                _ => {
                    ::protobuf::rt::read_unknown_or_skip_group(field_number, wire_type, is, self.mut_unknown_fields())?;
                },
            };
        }
        ::std::result::Result::Ok(())
    }

    // Compute sizes of nested messages
    #[allow(unused_variables)]
    fn compute_size(&self) -> u32 {
        let mut my_size = 0;
        if !self.host.is_empty() {
            my_size += ::protobuf::rt::string_size(1, &self.host);
        }
        if self.port != 0 {
            my_size += ::protobuf::rt::value_size(2, self.port, ::protobuf::wire_format::WireTypeVarint);
        }
        if self.version != 0 {
            my_size += ::protobuf::rt::value_size(3, self.version, ::protobuf::wire_format::WireTypeVarint);
        }
        my_size += ::protobuf::rt::unknown_fields_size(self.get_unknown_fields());
        self.cached_size.set(my_size);
        my_size
    }

    fn write_to_with_cached_sizes(&self, os: &mut ::protobuf::CodedOutputStream) -> ::protobuf::ProtobufResult<()> {
        if !self.host.is_empty() {
            os.write_string(1, &self.host)?;
        }
        if self.port != 0 {
            os.write_int32(2, self.port)?;
        }
        if self.version != 0 {
            os.write_int64(3, self.version)?;
        }
        os.write_unknown_fields(self.get_unknown_fields())?;
        ::std::result::Result::Ok(())
    }

    fn get_cached_size(&self) -> u32 {
        self.cached_size.get()
    }

    fn get_unknown_fields(&self) -> &::protobuf::UnknownFields {
        &self.unknown_fields
    }

    fn mut_unknown_fields(&mut self) -> &mut ::protobuf::UnknownFields {
        &mut self.unknown_fields
    }

    fn as_any(&self) -> &::std::any::Any {
        self as &::std::any::Any
    }
    fn as_any_mut(&mut self) -> &mut ::std::any::Any {
        self as &mut ::std::any::Any
    }
    fn into_any(self: Box<Self>) -> ::std::boxed::Box<::std::any::Any> {
        self
    }

    fn descriptor(&self) -> &'static ::protobuf::reflect::MessageDescriptor {
        Self::descriptor_static()
    }

    fn new() -> RpcAddressProto {
        RpcAddressProto::new()
    }

    fn descriptor_static() -> &'static ::protobuf::reflect::MessageDescriptor {
        static mut descriptor: ::protobuf::lazy::Lazy<::protobuf::reflect::MessageDescriptor> = ::protobuf::lazy::Lazy {
            lock: ::protobuf::lazy::ONCE_INIT,
            ptr: 0 as *const ::protobuf::reflect::MessageDescriptor,
        };
        unsafe {
            descriptor.get(|| {
                let mut fields = ::std::vec::Vec::new();
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeString>(
                    "host",
                    |m: &RpcAddressProto| { &m.host },
                    |m: &mut RpcAddressProto| { &mut m.host },
                ));
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeInt32>(
                    "port",
                    |m: &RpcAddressProto| { &m.port },
                    |m: &mut RpcAddressProto| { &mut m.port },
                ));
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeInt64>(
                    "version",
                    |m: &RpcAddressProto| { &m.version },
                    |m: &mut RpcAddressProto| { &mut m.version },
                ));
                ::protobuf::reflect::MessageDescriptor::new::<RpcAddressProto>(
                    "RpcAddressProto",
                    fields,
                    file_descriptor_proto()
                )
            })
        }
    }

    fn default_instance() -> &'static RpcAddressProto {
        static mut instance: ::protobuf::lazy::Lazy<RpcAddressProto> = ::protobuf::lazy::Lazy {
            lock: ::protobuf::lazy::ONCE_INIT,
            ptr: 0 as *const RpcAddressProto,
        };
        unsafe {
            instance.get(RpcAddressProto::new)
        }
    }
}

impl ::protobuf::Clear for RpcAddressProto {
    fn clear(&mut self) {
        self.clear_host();
        self.clear_port();
        self.clear_version();
        self.unknown_fields.clear();
    }
}

impl ::std::fmt::Debug for RpcAddressProto {
    fn fmt(&self, f: &mut ::std::fmt::Formatter) -> ::std::fmt::Result {
        ::protobuf::text_format::fmt(self, f)
    }
}

impl ::protobuf::reflect::ProtobufValue for RpcAddressProto {
    fn as_ref(&self) -> ::protobuf::reflect::ProtobufValueRef {
        ::protobuf::reflect::ProtobufValueRef::Message(self)
    }
}

#[derive(PartialEq,Clone,Default)]
pub struct TransferRequest {
    // message fields
    pub payload: ::std::vec::Vec<u8>,
    // special fields
    unknown_fields: ::protobuf::UnknownFields,
    cached_size: ::protobuf::CachedSize,
}

impl TransferRequest {
    pub fn new() -> TransferRequest {
        ::std::default::Default::default()
    }

    // bytes payload = 1;

    pub fn clear_payload(&mut self) {
        self.payload.clear();
    }

    // Param is passed by value, moved
    pub fn set_payload(&mut self, v: ::std::vec::Vec<u8>) {
        self.payload = v;
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_payload(&mut self) -> &mut ::std::vec::Vec<u8> {
        &mut self.payload
    }

    // Take field
    pub fn take_payload(&mut self) -> ::std::vec::Vec<u8> {
        ::std::mem::replace(&mut self.payload, ::std::vec::Vec::new())
    }

    pub fn get_payload(&self) -> &[u8] {
        &self.payload
    }
}

impl ::protobuf::Message for TransferRequest {
    fn is_initialized(&self) -> bool {
        true
    }

    fn merge_from(&mut self, is: &mut ::protobuf::CodedInputStream) -> ::protobuf::ProtobufResult<()> {
        while !is.eof()? {
            let (field_number, wire_type) = is.read_tag_unpack()?;
            match field_number {
                1 => {
                    ::protobuf::rt::read_singular_proto3_bytes_into(wire_type, is, &mut self.payload)?;
                },
                _ => {
                    ::protobuf::rt::read_unknown_or_skip_group(field_number, wire_type, is, self.mut_unknown_fields())?;
                },
            };
        }
        ::std::result::Result::Ok(())
    }

    // Compute sizes of nested messages
    #[allow(unused_variables)]
    fn compute_size(&self) -> u32 {
        let mut my_size = 0;
        if !self.payload.is_empty() {
            my_size += ::protobuf::rt::bytes_size(1, &self.payload);
        }
        my_size += ::protobuf::rt::unknown_fields_size(self.get_unknown_fields());
        self.cached_size.set(my_size);
        my_size
    }

    fn write_to_with_cached_sizes(&self, os: &mut ::protobuf::CodedOutputStream) -> ::protobuf::ProtobufResult<()> {
        if !self.payload.is_empty() {
            os.write_bytes(1, &self.payload)?;
        }
        os.write_unknown_fields(self.get_unknown_fields())?;
        ::std::result::Result::Ok(())
    }

    fn get_cached_size(&self) -> u32 {
        self.cached_size.get()
    }

    fn get_unknown_fields(&self) -> &::protobuf::UnknownFields {
        &self.unknown_fields
    }

    fn mut_unknown_fields(&mut self) -> &mut ::protobuf::UnknownFields {
        &mut self.unknown_fields
    }

    fn as_any(&self) -> &::std::any::Any {
        self as &::std::any::Any
    }
    fn as_any_mut(&mut self) -> &mut ::std::any::Any {
        self as &mut ::std::any::Any
    }
    fn into_any(self: Box<Self>) -> ::std::boxed::Box<::std::any::Any> {
        self
    }

    fn descriptor(&self) -> &'static ::protobuf::reflect::MessageDescriptor {
        Self::descriptor_static()
    }

    fn new() -> TransferRequest {
        TransferRequest::new()
    }

    fn descriptor_static() -> &'static ::protobuf::reflect::MessageDescriptor {
        static mut descriptor: ::protobuf::lazy::Lazy<::protobuf::reflect::MessageDescriptor> = ::protobuf::lazy::Lazy {
            lock: ::protobuf::lazy::ONCE_INIT,
            ptr: 0 as *const ::protobuf::reflect::MessageDescriptor,
        };
        unsafe {
            descriptor.get(|| {
                let mut fields = ::std::vec::Vec::new();
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeBytes>(
                    "payload",
                    |m: &TransferRequest| { &m.payload },
                    |m: &mut TransferRequest| { &mut m.payload },
                ));
                ::protobuf::reflect::MessageDescriptor::new::<TransferRequest>(
                    "TransferRequest",
                    fields,
                    file_descriptor_proto()
                )
            })
        }
    }

    fn default_instance() -> &'static TransferRequest {
        static mut instance: ::protobuf::lazy::Lazy<TransferRequest> = ::protobuf::lazy::Lazy {
            lock: ::protobuf::lazy::ONCE_INIT,
            ptr: 0 as *const TransferRequest,
        };
        unsafe {
            instance.get(TransferRequest::new)
        }
    }
}

impl ::protobuf::Clear for TransferRequest {
    fn clear(&mut self) {
        self.clear_payload();
        self.unknown_fields.clear();
    }
}

impl ::std::fmt::Debug for TransferRequest {
    fn fmt(&self, f: &mut ::std::fmt::Formatter) -> ::std::fmt::Result {
        ::protobuf::text_format::fmt(self, f)
    }
}

impl ::protobuf::reflect::ProtobufValue for TransferRequest {
    fn as_ref(&self) -> ::protobuf::reflect::ProtobufValueRef {
        ::protobuf::reflect::ProtobufValueRef::Message(self)
    }
}

#[derive(PartialEq,Clone,Default)]
pub struct TransferResponse {
    // message fields
    pub exception: ::std::string::String,
    // special fields
    unknown_fields: ::protobuf::UnknownFields,
    cached_size: ::protobuf::CachedSize,
}

impl TransferResponse {
    pub fn new() -> TransferResponse {
        ::std::default::Default::default()
    }

    // string exception = 1;

    pub fn clear_exception(&mut self) {
        self.exception.clear();
    }

    // Param is passed by value, moved
    pub fn set_exception(&mut self, v: ::std::string::String) {
        self.exception = v;
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_exception(&mut self) -> &mut ::std::string::String {
        &mut self.exception
    }

    // Take field
    pub fn take_exception(&mut self) -> ::std::string::String {
        ::std::mem::replace(&mut self.exception, ::std::string::String::new())
    }

    pub fn get_exception(&self) -> &str {
        &self.exception
    }
}

impl ::protobuf::Message for TransferResponse {
    fn is_initialized(&self) -> bool {
        true
    }

    fn merge_from(&mut self, is: &mut ::protobuf::CodedInputStream) -> ::protobuf::ProtobufResult<()> {
        while !is.eof()? {
            let (field_number, wire_type) = is.read_tag_unpack()?;
            match field_number {
                1 => {
                    ::protobuf::rt::read_singular_proto3_string_into(wire_type, is, &mut self.exception)?;
                },
                _ => {
                    ::protobuf::rt::read_unknown_or_skip_group(field_number, wire_type, is, self.mut_unknown_fields())?;
                },
            };
        }
        ::std::result::Result::Ok(())
    }

    // Compute sizes of nested messages
    #[allow(unused_variables)]
    fn compute_size(&self) -> u32 {
        let mut my_size = 0;
        if !self.exception.is_empty() {
            my_size += ::protobuf::rt::string_size(1, &self.exception);
        }
        my_size += ::protobuf::rt::unknown_fields_size(self.get_unknown_fields());
        self.cached_size.set(my_size);
        my_size
    }

    fn write_to_with_cached_sizes(&self, os: &mut ::protobuf::CodedOutputStream) -> ::protobuf::ProtobufResult<()> {
        if !self.exception.is_empty() {
            os.write_string(1, &self.exception)?;
        }
        os.write_unknown_fields(self.get_unknown_fields())?;
        ::std::result::Result::Ok(())
    }

    fn get_cached_size(&self) -> u32 {
        self.cached_size.get()
    }

    fn get_unknown_fields(&self) -> &::protobuf::UnknownFields {
        &self.unknown_fields
    }

    fn mut_unknown_fields(&mut self) -> &mut ::protobuf::UnknownFields {
        &mut self.unknown_fields
    }

    fn as_any(&self) -> &::std::any::Any {
        self as &::std::any::Any
    }
    fn as_any_mut(&mut self) -> &mut ::std::any::Any {
        self as &mut ::std::any::Any
    }
    fn into_any(self: Box<Self>) -> ::std::boxed::Box<::std::any::Any> {
        self
    }

    fn descriptor(&self) -> &'static ::protobuf::reflect::MessageDescriptor {
        Self::descriptor_static()
    }

    fn new() -> TransferResponse {
        TransferResponse::new()
    }

    fn descriptor_static() -> &'static ::protobuf::reflect::MessageDescriptor {
        static mut descriptor: ::protobuf::lazy::Lazy<::protobuf::reflect::MessageDescriptor> = ::protobuf::lazy::Lazy {
            lock: ::protobuf::lazy::ONCE_INIT,
            ptr: 0 as *const ::protobuf::reflect::MessageDescriptor,
        };
        unsafe {
            descriptor.get(|| {
                let mut fields = ::std::vec::Vec::new();
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeString>(
                    "exception",
                    |m: &TransferResponse| { &m.exception },
                    |m: &mut TransferResponse| { &mut m.exception },
                ));
                ::protobuf::reflect::MessageDescriptor::new::<TransferResponse>(
                    "TransferResponse",
                    fields,
                    file_descriptor_proto()
                )
            })
        }
    }

    fn default_instance() -> &'static TransferResponse {
        static mut instance: ::protobuf::lazy::Lazy<TransferResponse> = ::protobuf::lazy::Lazy {
            lock: ::protobuf::lazy::ONCE_INIT,
            ptr: 0 as *const TransferResponse,
        };
        unsafe {
            instance.get(TransferResponse::new)
        }
    }
}

impl ::protobuf::Clear for TransferResponse {
    fn clear(&mut self) {
        self.clear_exception();
        self.unknown_fields.clear();
    }
}

impl ::std::fmt::Debug for TransferResponse {
    fn fmt(&self, f: &mut ::std::fmt::Formatter) -> ::std::fmt::Result {
        ::protobuf::text_format::fmt(self, f)
    }
}

impl ::protobuf::reflect::ProtobufValue for TransferResponse {
    fn as_ref(&self) -> ::protobuf::reflect::ProtobufValueRef {
        ::protobuf::reflect::ProtobufValueRef::Message(self)
    }
}

static file_descriptor_proto_data: &'static [u8] = b"\
    \n\trpc.proto\x12\ttinkerpop\"S\n\x0fRpcAddressProto\x12\x12\n\x04host\
    \x18\x01\x20\x01(\tR\x04host\x12\x12\n\x04port\x18\x02\x20\x01(\x05R\x04\
    port\x12\x18\n\x07version\x18\x03\x20\x01(\x03R\x07version\"+\n\x0fTrans\
    ferRequest\x12\x18\n\x07payload\x18\x01\x20\x01(\x0cR\x07payload\"0\n\
    \x10TransferResponse\x12\x1c\n\texception\x18\x01\x20\x01(\tR\texception\
    2T\n\x0fTransferService\x12A\n\x04send\x12\x1a.tinkerpop.TransferRequest\
    \x1a\x1b.tinkerpop.TransferResponse\"\0B0\n\x1acom.alibaba.maxgraph.prot\
    oB\rTransferProtoP\0\x88\x01\x01b\x06proto3\
";

static mut file_descriptor_proto_lazy: ::protobuf::lazy::Lazy<::protobuf::descriptor::FileDescriptorProto> = ::protobuf::lazy::Lazy {
    lock: ::protobuf::lazy::ONCE_INIT,
    ptr: 0 as *const ::protobuf::descriptor::FileDescriptorProto,
};

fn parse_descriptor_proto() -> ::protobuf::descriptor::FileDescriptorProto {
    ::protobuf::parse_from_bytes(file_descriptor_proto_data).unwrap()
}

pub fn file_descriptor_proto() -> &'static ::protobuf::descriptor::FileDescriptorProto {
    unsafe {
        file_descriptor_proto_lazy.get(|| {
            parse_descriptor_proto()
        })
    }
}
