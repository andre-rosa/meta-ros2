# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "rosatomic provides the C++11-style atomic operations by pulling symbols from the proposed Boost.Atomic      package into the ros namespace.  Once C++11-style atomics (std::atomic) are available from compilers, rosatomic will      conditionally use those instead."
AUTHOR = "Devon Ash <dash@clearpathrobotics.com>"
ROS_AUTHOR = "Josh Faust"
HOMEPAGE = "http://ros.org/wiki/rosatomic"
SECTION = "devel"
LICENSE = "BSD & Boost-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_realtime"
ROS_BPN = "rosatomic"

ROS_BUILD_DEPENDS = ""

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

SRC_URI = "https://github.com/ros-gbp/ros_realtime-release/archive/release/melodic/rosatomic/1.0.25-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "adedfe75f76bfe917a74ca43c689f69d"
SRC_URI[sha256sum] = "d4f38df7e64e7cef90ce597674a5832653f0e564dbc4163f5232fa180215b4d1"
S = "${WORKDIR}/ros_realtime-release-release-melodic-rosatomic-1.0.25-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ros-realtime', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ros-realtime', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-realtime/ros-realtime_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-realtime/ros-realtime-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-realtime/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-realtime/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
