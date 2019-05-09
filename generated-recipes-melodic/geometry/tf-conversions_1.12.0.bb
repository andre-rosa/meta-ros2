# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This package contains a set of conversion functions to convert common tf datatypes (point, vector, pose, etc) into semantically identical datatypes used by other libraries. The conversion functions make it easier for users of the transform library (tf) to work with the datatype of their choice. Currently this package has support for the Kinematics and Dynamics Library (KDL) and the Eigen matrix library. This package is stable, and will get integrated into tf in the next major release cycle (see roadmap)."
AUTHOR = "Tully Foote <tfoote@osrfoundation.org>"
ROS_AUTHOR = "Tully Foote"
HOMEPAGE = "http://www.ros.org/wiki/tf_conversions"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "geometry"
ROS_BPN = "tf_conversions"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    kdl-conversions \
    libeigen \
    orocos-kdl \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    kdl-conversions \
    libeigen \
    orocos-kdl \
    python-orocos-kdl \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    kdl-conversions \
    libeigen \
    orocos-kdl \
    python-orocos-kdl \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/melodic/tf_conversions/1.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "fb8e975aea29d6190e65753bdc433b61"
SRC_URI[sha256sum] = "eec87e068f5106c1835fb093d5995ca8c6972e3a5e127038d94c68701ad2029e"
S = "${WORKDIR}/geometry-release-release-melodic-tf_conversions-1.12.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('geometry', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('geometry', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry/geometry_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry/geometry-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
