# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a C++ parser for the Unified Robot Description     Format (URDF), which is an XML format for representing a robot model.     The code API of the parser has been through our review process and will remain     backwards compatible in future releases."
AUTHOR = "Chris Lalancette <clalancette@osrfoundation.org>"
HOMEPAGE = "https://github.com/ros2/urdf"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "urdf"

ROS_BUILD_DEPENDS = " \
    libtinyxml \
    tinyxml-vendor \
    urdfdom \
    urdfdom-headers \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    libtinyxml \
    urdfdom-headers \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libtinyxml \
    tinyxml-vendor \
    urdfdom \
    urdfdom-headers \
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

SRC_URI = "https://github.com/ros2-gbp/urdf-release/archive/release/bouncy/urdf/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5bedf661a126d2720130807542deaa01"
SRC_URI[sha256sum] = "2e8ea3503c1ebcf88b1a25ebd9625c25e765666fae6d28d1402093f4520dbb0f"
S = "${WORKDIR}/urdf-release-release-bouncy-urdf-2.1.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/urdf/urdf_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/urdf/urdf_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/urdf/urdf-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/urdf/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/urdf/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
