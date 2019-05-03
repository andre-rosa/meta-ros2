# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Generate the message type support for dynamic message construction in C."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BPN = "rosidl_typesupport_introspection_c"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
    rosidl-cmake-native \
"

ROS_EXEC_DEPENDS = " \
    rosidl-cmake \
    rosidl-generator-c \
    rosidl-parser \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/bouncy/rosidl_typesupport_introspection_c/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5164d5e21e11d7bd048cc16fd33d7b52"
SRC_URI[sha256sum] = "16162f0ec85f7831c42c950003d0febd9c89542a6746467a2dc80ed4ad024ac7"
S = "${WORKDIR}/rosidl-release-release-bouncy-rosidl_typesupport_introspection_c-0.5.1-0"

ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('rosidl', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosidl/rosidl_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosidl/rosidl-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosidl/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosidl/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
