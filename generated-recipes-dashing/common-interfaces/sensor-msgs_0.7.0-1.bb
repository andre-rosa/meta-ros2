# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "A package containing some sensor data related message and service definitions."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "common_interfaces"
ROS_BPN = "sensor_msgs"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    geometry-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    geometry-msgs \
    rosidl-default-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    rosidl-cmake \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/dashing/sensor_msgs/0.7.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4c6608abf2ee51e6160ba9f46b463568"
SRC_URI[sha256sum] = "34e8339737d225ec9f72105e48ff916accd386d0b77aff2584eee4dd6cbb49fc"
S = "${WORKDIR}/common_interfaces-release-release-dashing-sensor_msgs-0.7.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('common-interfaces', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('common-interfaces', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/common-interfaces/common-interfaces_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/common-interfaces/common-interfaces-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/common-interfaces/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/common-interfaces/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
