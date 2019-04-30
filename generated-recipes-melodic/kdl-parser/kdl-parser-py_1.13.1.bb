# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The Kinematics and Dynamics Library (KDL) defines a tree structure    to represent the kinematic and dynamic parameters of a robot    mechanism. <tt>kdl_parser_py</tt> provides Python tools to construct a KDL    tree from an XML robot representation in URDF."
AUTHOR = "Chris Lalancette <clalancette@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/kdl_parser_py"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    orocos-kdl \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    python-catkin-pkg-native \
"

ROS_EXPORT_DEPENDS = " \
    orocos-kdl \
    python-orocos-kdl \
    urdf \
    urdfdom-py \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    orocos-kdl \
    python-orocos-kdl \
    urdf \
    urdfdom-py \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/kdl_parser-release/archive/release/melodic/kdl_parser_py/1.13.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1e0380ca518a1ced4b8de78ba070cebe"
SRC_URI[sha256sum] = "66da27c1d53a445cc5334768a54a2f792df8c46475fe24a91ff486675082c86a"
S = "${WORKDIR}/kdl_parser-release-release-melodic-kdl_parser_py-1.13.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/kdl-parser/kdl-parser_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/kdl-parser/kdl-parser_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/kdl-parser/kdl-parser-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/kdl-parser/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/kdl-parser/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
