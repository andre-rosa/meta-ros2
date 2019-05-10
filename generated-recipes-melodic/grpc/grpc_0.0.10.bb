# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Catkinized gRPC Package"
AUTHOR = "Shengye Wang <shengye@ucsd.edu>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "grpc"
ROS_BPN = "grpc"

ROS_BUILD_DEPENDS = " \
    git \
    zlib \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/CogRobRelease/catkin_grpc-release/archive/release/melodic/grpc/0.0.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6deb0491866113c3b07932bcfbc08801"
SRC_URI[sha256sum] = "c68b25e98a58f726e6d9a86a1a16c943c468e8f1d426781f9086cd31c525e7b2"
S = "${WORKDIR}/catkin_grpc-release-release-melodic-grpc-0.0.10-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('grpc', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('grpc', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/grpc/grpc_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/grpc/grpc-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/grpc/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/grpc/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
