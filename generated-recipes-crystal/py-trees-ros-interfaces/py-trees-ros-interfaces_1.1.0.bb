# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interfaces used by py_trees_ros and py_trees_ros_tutorials."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/py_trees_ros_interfaces"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    action-msgs \
    geometry-msgs \
    rosidl-default-generators \
    unique-identifier-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    action-msgs \
    geometry-msgs \
    unique-identifier-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    action-msgs \
    geometry-msgs \
    rosidl-default-runtime \
    unique-identifier-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/stonier/py_trees_ros_interfaces-release/archive/release/crystal/py_trees_ros_interfaces/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "02144cd223fc0f7a55414be11c99ad9e"
SRC_URI[sha256sum] = "3a25be87767060f9adcbc42f2846a4c672d45808a2aea175196d03025ba6d567"
S = "${WORKDIR}/py_trees_ros_interfaces-release-release-crystal-py_trees_ros_interfaces-1.1.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/py-trees-ros-interfaces/py-trees-ros-interfaces_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/py-trees-ros-interfaces/py-trees-ros-interfaces_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/py-trees-ros-interfaces/py-trees-ros-interfaces-${PV}_common.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
