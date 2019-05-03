# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This package defines messages commonly used in mapping packages."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/map_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_BPN = "map_msgs"

ROS_BUILD_DEPENDS = " \
    nav-msgs \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    nav-msgs \
    rosidl-default-runtime \
    sensor-msgs \
    std-msgs \
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

SRC_URI = "https://github.com/ros2-gbp/navigation_msgs-release/archive/release/crystal/map_msgs/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "afcc12d7775e38b9fd292eed0b3f1c7a"
SRC_URI[sha256sum] = "73777431375ad7b3d56e25f88ed4655e757047b218ae32ff4ce34affce8ee2bb"
S = "${WORKDIR}/navigation_msgs-release-release-crystal-map_msgs-2.0.1-0"

ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('navigation-msgs', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-msgs/navigation-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-msgs/navigation-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-msgs/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
