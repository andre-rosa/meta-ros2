# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This package depends on a recent version of the Kinematics and Dynamics     Library (KDL), distributed by the Orocos Project. It is a meta-package that     depends on kdl which contains the c++ version and pykdl which contains the     generated python bindings."
AUTHOR = "Orocos Developers <orocos-dev@lists.mech.kuleuven.be>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

ROS_CN = "orocos_kinematics_dynamics"
ROS_BPN = "orocos_kinematics_dynamics"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    orocos-kdl \
    python-orocos-kdl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    orocos-kdl \
    python-orocos-kdl \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/orocos/orocos-kdl-release/archive/release/melodic/orocos_kinematics_dynamics/1.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c4d64355fb2ccb5e3bb2c06f39f4222a"
SRC_URI[sha256sum] = "2ba6018b3fbbced816694fafd40bf7a9eea586ee7955ec91e4de7864493a2150"
S = "${WORKDIR}/orocos-kdl-release-release-melodic-orocos_kinematics_dynamics-1.4.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('orocos-kinematics-dynamics', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('orocos-kinematics-dynamics', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/orocos-kinematics-dynamics/orocos-kinematics-dynamics_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/orocos-kinematics-dynamics/orocos-kinematics-dynamics-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/orocos-kinematics-dynamics/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/orocos-kinematics-dynamics/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
