# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Package with launch files for demonstrations with the RexROV 2 vehicle"
AUTHOR = "Musa Morena Marcusso Manhaes <Musa.Marcusso@de.bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_BPN = "rexrov2_gazebo"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rexrov2-control \
    rexrov2-description \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/uuvsimulator/rexrov2-release/archive/release/melodic/rexrov2_gazebo/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1ae78ab43c4652771c12a6f82ccfa3eb"
SRC_URI[sha256sum] = "ae244517e996486264c129ef22354f23c9e84f3e32be10a5fd7fa193bd0b15d9"
S = "${WORKDIR}/rexrov2-release-release-melodic-rexrov2_gazebo-0.1.3-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('rexrov2', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rexrov2/rexrov2_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rexrov2/rexrov2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rexrov2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rexrov2/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
