# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "ROSBag2 client library"
AUTHOR = "Karsten Knese <karsten@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosbag2"
ROS_BPN = "rosbag2"

ROS_BUILD_DEPENDS = " \
    ament-index-cpp \
    pluginlib \
    poco-vendor \
    rcutils \
    rosbag2-storage \
    rosidl-generator-cpp \
    rosidl-typesupport-cpp \
    rosidl-typesupport-introspection-cpp \
    shared-queues-vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-index-cpp \
    pluginlib \
    poco-vendor \
    rcutils \
    rosbag2-storage \
    rosidl-generator-cpp \
    rosidl-typesupport-cpp \
    rosidl-typesupport-introspection-cpp \
    shared-queues-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-cpp \
    pluginlib \
    poco-vendor \
    rcutils \
    rosbag2-storage \
    rosidl-generator-cpp \
    rosidl-typesupport-cpp \
    rosidl-typesupport-introspection-cpp \
    shared-queues-vendor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-lint-auto \
    ament-lint-common \
    rosbag2-test-common \
    test-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/crystal/rosbag2/0.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "44587db13ff382963a4a74514151dd41"
SRC_URI[sha256sum] = "3fd6bf46e3462909038feed3bf7019b83efb38731b9b1d5c136f1ac230cfe002"
S = "${WORKDIR}/rosbag2-release-release-crystal-rosbag2-0.0.7-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('rosbag2', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('rosbag2', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosbag2/rosbag2_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosbag2/rosbag2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosbag2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosbag2/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
