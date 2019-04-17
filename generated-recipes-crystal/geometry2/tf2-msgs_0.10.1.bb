# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_msgs"
AUTHOR = "Tully Foote <tfoote@osrfoundation.org>"
HOMEPAGE = "http://www.ros.org/wiki/tf2_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    builtin-interfaces \
    geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    geometry-msgs \
    rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/crystal/tf2_msgs/0.10.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "277ddbf2bc5a0d64444ff2adc9d9e356"
SRC_URI[sha256sum] = "3229d3ac0f9001ee47e1de7be89d370382142ea81501c9ba8a4e27c20c342c9e"
S = "${WORKDIR}/geometry2-release-release-crystal-tf2_msgs-0.10.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = " \
    rosidl_interface_packages \
"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/geometry2/geometry2_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/geometry2/geometry2_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry2/geometry2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry2/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
