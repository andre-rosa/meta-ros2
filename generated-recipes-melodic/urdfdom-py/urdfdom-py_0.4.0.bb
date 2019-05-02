# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python implementation of the URDF parser."
AUTHOR = "Chris Lalancette <clalancette@osrfoundation.org>"
HOMEPAGE = "http://wiki.ros.org/urdfdom_py"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "urdfdom_py"

ROS_BUILD_DEPENDS = " \
    python \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    python \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python \
    python-lxml \
    python-yamllint-native \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    python-mock \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/urdfdom_py-release/archive/release/melodic/urdfdom_py/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0836179118272260e2715455133fda4b"
SRC_URI[sha256sum] = "9d0663d9bde7a548ba4df458423922d7d1e326a786e50cc33846f0835c4843f6"
S = "${WORKDIR}/urdfdom_py-release-release-melodic-urdfdom_py-0.4.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/urdfdom-py/urdfdom-py_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/urdfdom-py/urdfdom-py_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/urdfdom-py/urdfdom-py-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/urdfdom-py/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/urdfdom-py/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
