# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This package contains a tool to convert Unified Robot Description Format (URDF) documents into COLLAborative Design Activity (COLLADA) documents.      Implements robot-specific COLLADA extensions as defined by     http://openrave.programmingvision.com/index.php/Started:COLLADA"
AUTHOR = "Chris Lalancette <clalancette@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/collada_urdf"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "collada_urdf"

ROS_BUILD_DEPENDS = " \
    angles \
    assimp \
    cmake-modules \
    collada-dom \
    collada-parser \
    geometric-shapes \
    libeigen \
    liburdfdom-dev \
    liburdfdom-headers-dev \
    resource-retriever \
    rosconsole \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    liburdfdom-headers-dev \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    assimp \
    collada-dom \
    collada-parser \
    geometric-shapes \
    liburdfdom-dev \
    resource-retriever \
    rosconsole \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/collada_urdf-release/archive/release/melodic/collada_urdf/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c7fbac1a342c992d146a4eac0af8672d"
SRC_URI[sha256sum] = "b45310a279cd0ed77c4c782656bcaed2417adc74d09b546d4a41eb0121e616c1"
S = "${WORKDIR}/collada_urdf-release-release-melodic-collada_urdf-1.12.12-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('collada-urdf', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/collada-urdf/collada-urdf_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/collada-urdf/collada-urdf-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/collada-urdf/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/collada-urdf/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
