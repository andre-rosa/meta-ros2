# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Package containing default plugins for format converters"
AUTHOR = "Karsten Knese <karsten@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosbag2"
ROS_BPN = "rosbag2_converter_default_plugins"

ROS_BUILD_DEPENDS = " \
    ament-index-cpp \
    pluginlib \
    poco-vendor \
    rcutils \
    rmw \
    rosbag2 \
    rosidl-generator-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-index-cpp \
    pluginlib \
    poco-vendor \
    rcutils \
    rmw \
    rosbag2 \
    rosidl-generator-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-cpp \
    pluginlib \
    poco-vendor \
    rcutils \
    rmw \
    rosbag2 \
    rosidl-generator-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-lint-auto \
    ament-lint-common \
    rcutils \
    rmw-fastrtps-dynamic-cpp \
    rosbag2 \
    rosbag2-test-common \
    test-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/crystal/rosbag2_converter_default_plugins/0.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7fd4abd83f66488e71d37236b351206a"
SRC_URI[sha256sum] = "b35732ce4c7388c40c5038fe73a76a440328b6abe6b1c70be3f4f64e7711336b"
S = "${WORKDIR}/rosbag2-release-release-crystal-rosbag2_converter_default_plugins-0.0.7-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rosbag2', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rosbag2', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosbag2/rosbag2_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosbag2/rosbag2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosbag2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosbag2/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
