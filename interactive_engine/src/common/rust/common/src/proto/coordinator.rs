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
pub struct HeartbeartRequest {
    // message fields
    pub nodeInfo: ::protobuf::SingularPtrField<super::cluster::NodeInfo>,
    pub clusterStateVersion: i64,
    pub nodeStateProto: ::protobuf::SingularPtrField<super::cluster::NodeStateProto>,
    pub logDir: ::std::string::String,
    pub aliveId: u64,
    pub metricInfo: ::protobuf::SingularPtrField<super::common::MetricInfoProto>,
    // special fields
    unknown_fields: ::protobuf::UnknownFields,
    cached_size: ::protobuf::CachedSize,
}

impl HeartbeartRequest {
    pub fn new() -> HeartbeartRequest {
        ::std::default::Default::default()
    }

    // .NodeInfo nodeInfo = 1;

    pub fn clear_nodeInfo(&mut self) {
        self.nodeInfo.clear();
    }

    pub fn has_nodeInfo(&self) -> bool {
        self.nodeInfo.is_some()
    }

    // Param is passed by value, moved
    pub fn set_nodeInfo(&mut self, v: super::cluster::NodeInfo) {
        self.nodeInfo = ::protobuf::SingularPtrField::some(v);
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_nodeInfo(&mut self) -> &mut super::cluster::NodeInfo {
        if self.nodeInfo.is_none() {
            self.nodeInfo.set_default();
        }
        self.nodeInfo.as_mut().unwrap()
    }

    // Take field
    pub fn take_nodeInfo(&mut self) -> super::cluster::NodeInfo {
        self.nodeInfo.take().unwrap_or_else(|| super::cluster::NodeInfo::new())
    }

    pub fn get_nodeInfo(&self) -> &super::cluster::NodeInfo {
        self.nodeInfo.as_ref().unwrap_or_else(|| super::cluster::NodeInfo::default_instance())
    }

    // int64 clusterStateVersion = 2;

    pub fn clear_clusterStateVersion(&mut self) {
        self.clusterStateVersion = 0;
    }

    // Param is passed by value, moved
    pub fn set_clusterStateVersion(&mut self, v: i64) {
        self.clusterStateVersion = v;
    }

    pub fn get_clusterStateVersion(&self) -> i64 {
        self.clusterStateVersion
    }

    // .NodeStateProto nodeStateProto = 3;

    pub fn clear_nodeStateProto(&mut self) {
        self.nodeStateProto.clear();
    }

    pub fn has_nodeStateProto(&self) -> bool {
        self.nodeStateProto.is_some()
    }

    // Param is passed by value, moved
    pub fn set_nodeStateProto(&mut self, v: super::cluster::NodeStateProto) {
        self.nodeStateProto = ::protobuf::SingularPtrField::some(v);
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_nodeStateProto(&mut self) -> &mut super::cluster::NodeStateProto {
        if self.nodeStateProto.is_none() {
            self.nodeStateProto.set_default();
        }
        self.nodeStateProto.as_mut().unwrap()
    }

    // Take field
    pub fn take_nodeStateProto(&mut self) -> super::cluster::NodeStateProto {
        self.nodeStateProto.take().unwrap_or_else(|| super::cluster::NodeStateProto::new())
    }

    pub fn get_nodeStateProto(&self) -> &super::cluster::NodeStateProto {
        self.nodeStateProto.as_ref().unwrap_or_else(|| super::cluster::NodeStateProto::default_instance())
    }

    // string logDir = 4;

    pub fn clear_logDir(&mut self) {
        self.logDir.clear();
    }

    // Param is passed by value, moved
    pub fn set_logDir(&mut self, v: ::std::string::String) {
        self.logDir = v;
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_logDir(&mut self) -> &mut ::std::string::String {
        &mut self.logDir
    }

    // Take field
    pub fn take_logDir(&mut self) -> ::std::string::String {
        ::std::mem::replace(&mut self.logDir, ::std::string::String::new())
    }

    pub fn get_logDir(&self) -> &str {
        &self.logDir
    }

    // uint64 aliveId = 5;

    pub fn clear_aliveId(&mut self) {
        self.aliveId = 0;
    }

    // Param is passed by value, moved
    pub fn set_aliveId(&mut self, v: u64) {
        self.aliveId = v;
    }

    pub fn get_aliveId(&self) -> u64 {
        self.aliveId
    }

    // .MetricInfoProto metricInfo = 6;

    pub fn clear_metricInfo(&mut self) {
        self.metricInfo.clear();
    }

    pub fn has_metricInfo(&self) -> bool {
        self.metricInfo.is_some()
    }

    // Param is passed by value, moved
    pub fn set_metricInfo(&mut self, v: super::common::MetricInfoProto) {
        self.metricInfo = ::protobuf::SingularPtrField::some(v);
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_metricInfo(&mut self) -> &mut super::common::MetricInfoProto {
        if self.metricInfo.is_none() {
            self.metricInfo.set_default();
        }
        self.metricInfo.as_mut().unwrap()
    }

    // Take field
    pub fn take_metricInfo(&mut self) -> super::common::MetricInfoProto {
        self.metricInfo.take().unwrap_or_else(|| super::common::MetricInfoProto::new())
    }

    pub fn get_metricInfo(&self) -> &super::common::MetricInfoProto {
        self.metricInfo.as_ref().unwrap_or_else(|| super::common::MetricInfoProto::default_instance())
    }
}

impl ::protobuf::Message for HeartbeartRequest {
    fn is_initialized(&self) -> bool {
        for v in &self.nodeInfo {
            if !v.is_initialized() {
                return false;
            }
        };
        for v in &self.nodeStateProto {
            if !v.is_initialized() {
                return false;
            }
        };
        for v in &self.metricInfo {
            if !v.is_initialized() {
                return false;
            }
        };
        true
    }

    fn merge_from(&mut self, is: &mut ::protobuf::CodedInputStream) -> ::protobuf::ProtobufResult<()> {
        while !is.eof()? {
            let (field_number, wire_type) = is.read_tag_unpack()?;
            match field_number {
                1 => {
                    ::protobuf::rt::read_singular_message_into(wire_type, is, &mut self.nodeInfo)?;
                },
                2 => {
                    if wire_type != ::protobuf::wire_format::WireTypeVarint {
                        return ::std::result::Result::Err(::protobuf::rt::unexpected_wire_type(wire_type));
                    }
                    let tmp = is.read_int64()?;
                    self.clusterStateVersion = tmp;
                },
                3 => {
                    ::protobuf::rt::read_singular_message_into(wire_type, is, &mut self.nodeStateProto)?;
                },
                4 => {
                    ::protobuf::rt::read_singular_proto3_string_into(wire_type, is, &mut self.logDir)?;
                },
                5 => {
                    if wire_type != ::protobuf::wire_format::WireTypeVarint {
                        return ::std::result::Result::Err(::protobuf::rt::unexpected_wire_type(wire_type));
                    }
                    let tmp = is.read_uint64()?;
                    self.aliveId = tmp;
                },
                6 => {
                    ::protobuf::rt::read_singular_message_into(wire_type, is, &mut self.metricInfo)?;
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
        if let Some(ref v) = self.nodeInfo.as_ref() {
            let len = v.compute_size();
            my_size += 1 + ::protobuf::rt::compute_raw_varint32_size(len) + len;
        }
        if self.clusterStateVersion != 0 {
            my_size += ::protobuf::rt::value_size(2, self.clusterStateVersion, ::protobuf::wire_format::WireTypeVarint);
        }
        if let Some(ref v) = self.nodeStateProto.as_ref() {
            let len = v.compute_size();
            my_size += 1 + ::protobuf::rt::compute_raw_varint32_size(len) + len;
        }
        if !self.logDir.is_empty() {
            my_size += ::protobuf::rt::string_size(4, &self.logDir);
        }
        if self.aliveId != 0 {
            my_size += ::protobuf::rt::value_size(5, self.aliveId, ::protobuf::wire_format::WireTypeVarint);
        }
        if let Some(ref v) = self.metricInfo.as_ref() {
            let len = v.compute_size();
            my_size += 1 + ::protobuf::rt::compute_raw_varint32_size(len) + len;
        }
        my_size += ::protobuf::rt::unknown_fields_size(self.get_unknown_fields());
        self.cached_size.set(my_size);
        my_size
    }

    fn write_to_with_cached_sizes(&self, os: &mut ::protobuf::CodedOutputStream) -> ::protobuf::ProtobufResult<()> {
        if let Some(ref v) = self.nodeInfo.as_ref() {
            os.write_tag(1, ::protobuf::wire_format::WireTypeLengthDelimited)?;
            os.write_raw_varint32(v.get_cached_size())?;
            v.write_to_with_cached_sizes(os)?;
        }
        if self.clusterStateVersion != 0 {
            os.write_int64(2, self.clusterStateVersion)?;
        }
        if let Some(ref v) = self.nodeStateProto.as_ref() {
            os.write_tag(3, ::protobuf::wire_format::WireTypeLengthDelimited)?;
            os.write_raw_varint32(v.get_cached_size())?;
            v.write_to_with_cached_sizes(os)?;
        }
        if !self.logDir.is_empty() {
            os.write_string(4, &self.logDir)?;
        }
        if self.aliveId != 0 {
            os.write_uint64(5, self.aliveId)?;
        }
        if let Some(ref v) = self.metricInfo.as_ref() {
            os.write_tag(6, ::protobuf::wire_format::WireTypeLengthDelimited)?;
            os.write_raw_varint32(v.get_cached_size())?;
            v.write_to_with_cached_sizes(os)?;
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

    fn new() -> HeartbeartRequest {
        HeartbeartRequest::new()
    }

    fn descriptor_static() -> &'static ::protobuf::reflect::MessageDescriptor {
        static mut descriptor: ::protobuf::lazy::Lazy<::protobuf::reflect::MessageDescriptor> = ::protobuf::lazy::Lazy {
            lock: ::protobuf::lazy::ONCE_INIT,
            ptr: 0 as *const ::protobuf::reflect::MessageDescriptor,
        };
        unsafe {
            descriptor.get(|| {
                let mut fields = ::std::vec::Vec::new();
                fields.push(::protobuf::reflect::accessor::make_singular_ptr_field_accessor::<_, ::protobuf::types::ProtobufTypeMessage<super::cluster::NodeInfo>>(
                    "nodeInfo",
                    |m: &HeartbeartRequest| { &m.nodeInfo },
                    |m: &mut HeartbeartRequest| { &mut m.nodeInfo },
                ));
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeInt64>(
                    "clusterStateVersion",
                    |m: &HeartbeartRequest| { &m.clusterStateVersion },
                    |m: &mut HeartbeartRequest| { &mut m.clusterStateVersion },
                ));
                fields.push(::protobuf::reflect::accessor::make_singular_ptr_field_accessor::<_, ::protobuf::types::ProtobufTypeMessage<super::cluster::NodeStateProto>>(
                    "nodeStateProto",
                    |m: &HeartbeartRequest| { &m.nodeStateProto },
                    |m: &mut HeartbeartRequest| { &mut m.nodeStateProto },
                ));
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeString>(
                    "logDir",
                    |m: &HeartbeartRequest| { &m.logDir },
                    |m: &mut HeartbeartRequest| { &mut m.logDir },
                ));
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeUint64>(
                    "aliveId",
                    |m: &HeartbeartRequest| { &m.aliveId },
                    |m: &mut HeartbeartRequest| { &mut m.aliveId },
                ));
                fields.push(::protobuf::reflect::accessor::make_singular_ptr_field_accessor::<_, ::protobuf::types::ProtobufTypeMessage<super::common::MetricInfoProto>>(
                    "metricInfo",
                    |m: &HeartbeartRequest| { &m.metricInfo },
                    |m: &mut HeartbeartRequest| { &mut m.metricInfo },
                ));
                ::protobuf::reflect::MessageDescriptor::new::<HeartbeartRequest>(
                    "HeartbeartRequest",
                    fields,
                    file_descriptor_proto()
                )
            })
        }
    }

    fn default_instance() -> &'static HeartbeartRequest {
        static mut instance: ::protobuf::lazy::Lazy<HeartbeartRequest> = ::protobuf::lazy::Lazy {
            lock: ::protobuf::lazy::ONCE_INIT,
            ptr: 0 as *const HeartbeartRequest,
        };
        unsafe {
            instance.get(HeartbeartRequest::new)
        }
    }
}

impl ::protobuf::Clear for HeartbeartRequest {
    fn clear(&mut self) {
        self.clear_nodeInfo();
        self.clear_clusterStateVersion();
        self.clear_nodeStateProto();
        self.clear_logDir();
        self.clear_aliveId();
        self.clear_metricInfo();
        self.unknown_fields.clear();
    }
}

impl ::std::fmt::Debug for HeartbeartRequest {
    fn fmt(&self, f: &mut ::std::fmt::Formatter) -> ::std::fmt::Result {
        ::protobuf::text_format::fmt(self, f)
    }
}

impl ::protobuf::reflect::ProtobufValue for HeartbeartRequest {
    fn as_ref(&self) -> ::protobuf::reflect::ProtobufValueRef {
        ::protobuf::reflect::ProtobufValueRef::Message(self)
    }
}

#[derive(PartialEq,Clone,Default)]
pub struct HeartbeartResponse {
    // message fields
    pub clusterStateVersion: i64,
    pub clusterState: ::protobuf::SingularPtrField<super::cluster::ClusterStateProto>,
    pub aliveId: u64,
    pub isLegal: bool,
    // special fields
    unknown_fields: ::protobuf::UnknownFields,
    cached_size: ::protobuf::CachedSize,
}

impl HeartbeartResponse {
    pub fn new() -> HeartbeartResponse {
        ::std::default::Default::default()
    }

    // int64 clusterStateVersion = 1;

    pub fn clear_clusterStateVersion(&mut self) {
        self.clusterStateVersion = 0;
    }

    // Param is passed by value, moved
    pub fn set_clusterStateVersion(&mut self, v: i64) {
        self.clusterStateVersion = v;
    }

    pub fn get_clusterStateVersion(&self) -> i64 {
        self.clusterStateVersion
    }

    // .ClusterStateProto clusterState = 2;

    pub fn clear_clusterState(&mut self) {
        self.clusterState.clear();
    }

    pub fn has_clusterState(&self) -> bool {
        self.clusterState.is_some()
    }

    // Param is passed by value, moved
    pub fn set_clusterState(&mut self, v: super::cluster::ClusterStateProto) {
        self.clusterState = ::protobuf::SingularPtrField::some(v);
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_clusterState(&mut self) -> &mut super::cluster::ClusterStateProto {
        if self.clusterState.is_none() {
            self.clusterState.set_default();
        }
        self.clusterState.as_mut().unwrap()
    }

    // Take field
    pub fn take_clusterState(&mut self) -> super::cluster::ClusterStateProto {
        self.clusterState.take().unwrap_or_else(|| super::cluster::ClusterStateProto::new())
    }

    pub fn get_clusterState(&self) -> &super::cluster::ClusterStateProto {
        self.clusterState.as_ref().unwrap_or_else(|| super::cluster::ClusterStateProto::default_instance())
    }

    // uint64 aliveId = 3;

    pub fn clear_aliveId(&mut self) {
        self.aliveId = 0;
    }

    // Param is passed by value, moved
    pub fn set_aliveId(&mut self, v: u64) {
        self.aliveId = v;
    }

    pub fn get_aliveId(&self) -> u64 {
        self.aliveId
    }

    // bool isLegal = 4;

    pub fn clear_isLegal(&mut self) {
        self.isLegal = false;
    }

    // Param is passed by value, moved
    pub fn set_isLegal(&mut self, v: bool) {
        self.isLegal = v;
    }

    pub fn get_isLegal(&self) -> bool {
        self.isLegal
    }
}

impl ::protobuf::Message for HeartbeartResponse {
    fn is_initialized(&self) -> bool {
        for v in &self.clusterState {
            if !v.is_initialized() {
                return false;
            }
        };
        true
    }

    fn merge_from(&mut self, is: &mut ::protobuf::CodedInputStream) -> ::protobuf::ProtobufResult<()> {
        while !is.eof()? {
            let (field_number, wire_type) = is.read_tag_unpack()?;
            match field_number {
                1 => {
                    if wire_type != ::protobuf::wire_format::WireTypeVarint {
                        return ::std::result::Result::Err(::protobuf::rt::unexpected_wire_type(wire_type));
                    }
                    let tmp = is.read_int64()?;
                    self.clusterStateVersion = tmp;
                },
                2 => {
                    ::protobuf::rt::read_singular_message_into(wire_type, is, &mut self.clusterState)?;
                },
                3 => {
                    if wire_type != ::protobuf::wire_format::WireTypeVarint {
                        return ::std::result::Result::Err(::protobuf::rt::unexpected_wire_type(wire_type));
                    }
                    let tmp = is.read_uint64()?;
                    self.aliveId = tmp;
                },
                4 => {
                    if wire_type != ::protobuf::wire_format::WireTypeVarint {
                        return ::std::result::Result::Err(::protobuf::rt::unexpected_wire_type(wire_type));
                    }
                    let tmp = is.read_bool()?;
                    self.isLegal = tmp;
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
        if self.clusterStateVersion != 0 {
            my_size += ::protobuf::rt::value_size(1, self.clusterStateVersion, ::protobuf::wire_format::WireTypeVarint);
        }
        if let Some(ref v) = self.clusterState.as_ref() {
            let len = v.compute_size();
            my_size += 1 + ::protobuf::rt::compute_raw_varint32_size(len) + len;
        }
        if self.aliveId != 0 {
            my_size += ::protobuf::rt::value_size(3, self.aliveId, ::protobuf::wire_format::WireTypeVarint);
        }
        if self.isLegal != false {
            my_size += 2;
        }
        my_size += ::protobuf::rt::unknown_fields_size(self.get_unknown_fields());
        self.cached_size.set(my_size);
        my_size
    }

    fn write_to_with_cached_sizes(&self, os: &mut ::protobuf::CodedOutputStream) -> ::protobuf::ProtobufResult<()> {
        if self.clusterStateVersion != 0 {
            os.write_int64(1, self.clusterStateVersion)?;
        }
        if let Some(ref v) = self.clusterState.as_ref() {
            os.write_tag(2, ::protobuf::wire_format::WireTypeLengthDelimited)?;
            os.write_raw_varint32(v.get_cached_size())?;
            v.write_to_with_cached_sizes(os)?;
        }
        if self.aliveId != 0 {
            os.write_uint64(3, self.aliveId)?;
        }
        if self.isLegal != false {
            os.write_bool(4, self.isLegal)?;
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

    fn new() -> HeartbeartResponse {
        HeartbeartResponse::new()
    }

    fn descriptor_static() -> &'static ::protobuf::reflect::MessageDescriptor {
        static mut descriptor: ::protobuf::lazy::Lazy<::protobuf::reflect::MessageDescriptor> = ::protobuf::lazy::Lazy {
            lock: ::protobuf::lazy::ONCE_INIT,
            ptr: 0 as *const ::protobuf::reflect::MessageDescriptor,
        };
        unsafe {
            descriptor.get(|| {
                let mut fields = ::std::vec::Vec::new();
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeInt64>(
                    "clusterStateVersion",
                    |m: &HeartbeartResponse| { &m.clusterStateVersion },
                    |m: &mut HeartbeartResponse| { &mut m.clusterStateVersion },
                ));
                fields.push(::protobuf::reflect::accessor::make_singular_ptr_field_accessor::<_, ::protobuf::types::ProtobufTypeMessage<super::cluster::ClusterStateProto>>(
                    "clusterState",
                    |m: &HeartbeartResponse| { &m.clusterState },
                    |m: &mut HeartbeartResponse| { &mut m.clusterState },
                ));
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeUint64>(
                    "aliveId",
                    |m: &HeartbeartResponse| { &m.aliveId },
                    |m: &mut HeartbeartResponse| { &mut m.aliveId },
                ));
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeBool>(
                    "isLegal",
                    |m: &HeartbeartResponse| { &m.isLegal },
                    |m: &mut HeartbeartResponse| { &mut m.isLegal },
                ));
                ::protobuf::reflect::MessageDescriptor::new::<HeartbeartResponse>(
                    "HeartbeartResponse",
                    fields,
                    file_descriptor_proto()
                )
            })
        }
    }

    fn default_instance() -> &'static HeartbeartResponse {
        static mut instance: ::protobuf::lazy::Lazy<HeartbeartResponse> = ::protobuf::lazy::Lazy {
            lock: ::protobuf::lazy::ONCE_INIT,
            ptr: 0 as *const HeartbeartResponse,
        };
        unsafe {
            instance.get(HeartbeartResponse::new)
        }
    }
}

impl ::protobuf::Clear for HeartbeartResponse {
    fn clear(&mut self) {
        self.clear_clusterStateVersion();
        self.clear_clusterState();
        self.clear_aliveId();
        self.clear_isLegal();
        self.unknown_fields.clear();
    }
}

impl ::std::fmt::Debug for HeartbeartResponse {
    fn fmt(&self, f: &mut ::std::fmt::Formatter) -> ::std::fmt::Result {
        ::protobuf::text_format::fmt(self, f)
    }
}

impl ::protobuf::reflect::ProtobufValue for HeartbeartResponse {
    fn as_ref(&self) -> ::protobuf::reflect::ProtobufValueRef {
        ::protobuf::reflect::ProtobufValueRef::Message(self)
    }
}

static file_descriptor_proto_data: &'static [u8] = b"\
    \n\x11coordinator.proto\x1a\rcluster.proto\x1a\x10sdk/common.proto\"\x89\
    \x02\n\x11HeartbeartRequest\x12%\n\x08nodeInfo\x18\x01\x20\x01(\x0b2\t.N\
    odeInfoR\x08nodeInfo\x120\n\x13clusterStateVersion\x18\x02\x20\x01(\x03R\
    \x13clusterStateVersion\x127\n\x0enodeStateProto\x18\x03\x20\x01(\x0b2\
    \x0f.NodeStateProtoR\x0enodeStateProto\x12\x16\n\x06logDir\x18\x04\x20\
    \x01(\tR\x06logDir\x12\x18\n\x07aliveId\x18\x05\x20\x01(\x04R\x07aliveId\
    \x120\n\nmetricInfo\x18\x06\x20\x01(\x0b2\x10.MetricInfoProtoR\nmetricIn\
    fo\"\xb2\x01\n\x12HeartbeartResponse\x120\n\x13clusterStateVersion\x18\
    \x01\x20\x01(\x03R\x13clusterStateVersion\x126\n\x0cclusterState\x18\x02\
    \x20\x01(\x0b2\x12.ClusterStateProtoR\x0cclusterState\x12\x18\n\x07alive\
    Id\x18\x03\x20\x01(\x04R\x07aliveId\x12\x18\n\x07isLegal\x18\x04\x20\x01\
    (\x08R\x07isLegal2E\n\x0bCoordinator\x126\n\theartbeat\x12\x12.Heartbear\
    tRequest\x1a\x13.HeartbeartResponse\"\0B\x1e\n\x1acom.alibaba.maxgraph.p\
    rotoP\x01b\x06proto3\
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
