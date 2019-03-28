# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The interface for rosidl typesupport packages."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

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

SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/crystal/rosidl_typesupport_interface/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "14f334c3785fa2bb555be358ffbb9088"
SRC_URI[sha256sum] = "c26bc487256f5667128fe176e27cf2295aab3474a41a53286066e0405b36d085"
S = "${WORKDIR}/rosidl-release-release-crystal-rosidl_typesupport_interface-0.6.3-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rosidl/rosidl_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rosidl/rosidl_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosidl/rosidl-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosidl/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosidl/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
