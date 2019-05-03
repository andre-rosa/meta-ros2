# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Conversion functions between KDL and geometry_msgs types."
AUTHOR = "Tully Foote <tfoote@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/kdl_conversions"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "kdl_conversions"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    orocos-kdl \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    orocos-kdl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    orocos-kdl \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/melodic/kdl_conversions/1.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "fc3247fc1d72cb407c2d3de99534728f"
SRC_URI[sha256sum] = "2a82a8648b7c47cdf7ee46f7bf331202c2d8e6a6d25c058d944f78283452994f"
S = "${WORKDIR}/geometry-release-release-melodic-kdl_conversions-1.12.0-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('geometry', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry/geometry_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry/geometry-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
